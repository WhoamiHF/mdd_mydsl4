package cz.cuni.mff.mdd.term;
import java.util.LinkedList;

public class Action {
    private final LinkedList<Robot> agents;
    private final ActionType actionType;
    private final Goal goal;
    public Action(Robot robot, ActionType assignedActionType, Goal assignedGoal){
        agents = new LinkedList<Robot>();
        agents.add(robot);
        actionType = assignedActionType;
        goal = assignedGoal;
    }
    public  Action(Team team, ActionType assignedActionType, Goal assignedGoal){
        agents = team.robots;
        actionType = assignedActionType;
        goal = assignedGoal;
    }
    public Action(Robot robot, ActionType assignedActionType){
        agents = new LinkedList<Robot>();
        agents.add(robot);
        actionType = assignedActionType;
        goal = null;
    }
    public  Action(Team team, ActionType assignedActionType){
        agents = team.robots;
        actionType = assignedActionType;
        goal = null;
    }

    public void run(){
        for (Robot r : agents){
            switch (actionType){
                case moveTo -> {
                    r.move(goal.position);
                }
                case turnOff -> {
                    r.turn(false);
                }
                case turnOn -> {
                    r.turn(true);
                }
            }
        }
    }
}
