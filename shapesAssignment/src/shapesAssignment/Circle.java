package shapesAssignment;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle(double radius, String colour, boolean filled) {
        this.radius = radius;
        super.setColour(colour);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius; // 2 pi R
    }

    @Override
    public String toString() {
        return "This circle has a radius of " + getRadius() + "Which is a subclass of " + super.toString(); // output has to comefrom toString method in shape class 

    }

}
