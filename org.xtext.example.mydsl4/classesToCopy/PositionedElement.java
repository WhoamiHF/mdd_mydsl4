package cz.cuni.mff.mdd.term;

public class PositionedElement extends NamedElement {
    protected Position position;

    public PositionedElement(String newName, Position newPosition) {
        super(newName);
        position = newPosition;
    }

    public boolean compare(PositionedElement other, ConditionType conditionType, int value) {
        switch (conditionType) {
            case isEqual -> {
                return other.position.distance(this.position) == value;
            }
            case isLessThan -> {
                return other.position.distance(this.position) < value;
            }
            case isGreaterThan -> {
                return other.position.distance(this.position) > value;
            }
            case isGreaterThanOrEqual -> {
                return other.position.distance(this.position) >= value;
            }
            case isLessThanOrEqual -> {
                return other.position.distance(this.position) <= value;
            }
        }
        return false;
    }
}