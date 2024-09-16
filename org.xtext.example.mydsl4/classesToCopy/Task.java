package cz.cuni.mff.mdd.term;

import java.util.LinkedList;

public class Task extends NamedElement {

    private final Condition condition;
    public LinkedList<Action> actions = new LinkedList<>();
    public Task(String newName, Condition newCondition){
        super(newName);
        condition = newCondition;
    }
    public Task(String newName){
        super(newName);
        condition = null;
    }
    public void run(){
        if (condition == null || condition.isTrue()){
            for (Action action : actions){
                action.run();
            }
        }
    }
}
