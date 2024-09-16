package cz.cuni.mff.mdd.term;

public class Position {
    private final int x, y;

    public Position(int _x, int _y){
        x = _x;
        y = _y;
    }
    public double distance(Position other){
        return Math.sqrt((other.y - y) * (other.y - y) + (other.x - x) * (other.x - x));
    }
}
