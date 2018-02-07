package shapesAssignment;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);

    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);

    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);

    }

    @Override // overrides for length of  a square
    public double getLength() {
        return super.getLength(); 
    }

    @Override // overrides for width of  a square
    public double getWidth() {
        return super.getWidth();
    }
    // dont nneed an area method since it gets inherated form rect class, and are is the same for both.

    @Override
    public String toString() {
        return "This square has a side length of " + super.getLength() + "which is a subclass of " + super.toString();
    }

}
