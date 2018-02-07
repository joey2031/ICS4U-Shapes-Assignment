package shapesAssignment;


abstract class Shape implements Comparable<Shape> { // super class

    private String colour;
    private boolean filled;

    public Shape() { // constructor 1
        colour = "Green";
        filled = true;

    }

    
    public Shape(String colour, boolean filled) {  // constructor

        this.colour = colour;
        this.filled = filled;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) { // setters and getters
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override // customize the methods
    public String toString() {
        return "The colour of the shape is " + getColour() + "." + " It is " + isFilled();

    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public int compareTo(Shape o){
        if(this.getArea() < o.getArea()){
            return -1;
        }
        else if (this.getArea() > o.getArea()){
        return 1;
        } else {
        return 0;
        }
    }

}
