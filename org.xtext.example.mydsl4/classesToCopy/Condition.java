package cz.cuni.mff.mdd.term;

public class Condition {
    private final Robot subject;
    private final Goal target;
    private final int distance;
    private final ConditionType conditionType;

    public Condition(Robot robot, ConditionType condition, Goal goal, int value){
        subject = robot;
        target = goal;
        conditionType = condition;
        distance = value;
    }
    public boolean isTrue(){
        return subject.compare(target, conditionType,distance);
    }
}
