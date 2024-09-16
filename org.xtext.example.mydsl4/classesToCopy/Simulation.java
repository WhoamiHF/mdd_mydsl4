package cz.cuni.mff.mdd.term;

import java.util.LinkedList;

public class Simulation {
    public LinkedList<Task> tasks = new LinkedList<>() ;
    private final Condition condition;

    public Simulation(Condition until){
        condition = until;
    }
    public Simulation(){
        condition = null;
    }
    public void run(){
        while (condition == null || condition.isTrue()){
            for (Task task : tasks){
                task.run();
            }
        }
    }
}
