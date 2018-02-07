package shapesAssignment;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
        
    }

    public Rectangle(double length, double width) { // constructor 1 
           this.width = width;
           this.length = length;
    }
        public Rectangle(double length, double width, String colour, boolean filled) { // constructor 2
            super.setColour(colour);
            super.setFilled(filled);
            this.width = width;
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) { // setters and getters
        this.length = length;
    }

    @Override // overrides to customize for area of  a rectangle
        public double getArea() {
            double area;
            area = length * width;
            return area;
       }

    @Override // overrodes to customize for permimiter of  a rectangle
   public double  getPerimeter(){
    return length + length + width + width; 
    
   }

    @Override // to string
    public String toString() {
        return "This rectanngle has a width of " +  getWidth() + " and length of " + getLength() + "Which is a subclass of " + super.toString();
        
    }
   
 
    
}
