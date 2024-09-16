package cz.cuni.mff.mdd.term;

import java.util.LinkedList;

public class Team extends NamedElement {
    public final LinkedList<Robot> robots = new LinkedList<Robot>();
    public Team(String newName){
        super(newName);
    }

    public Robot getRobotByName(String robotName){
        for (Robot r: robots){
            if (r.name.equals(robotName)){
                return r;
            }
        }
        return null;
    }

}

