package cz.cuni.mff.mdd.term;

public class Robot extends PositionedElement {
    private boolean power;
    public Robot (String newName, Position newPosition){
        super(newName, newPosition);
        power = false;
    }
    public void move(Position newPosition) {
        this.position = newPosition;
    }

    public void turn(Boolean newPower){
        power = newPower;
    }

    public boolean isRobotOn(){
        return power;
    }
}
