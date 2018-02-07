package shapesAssignment;
import java.util.ArrayList;
public class shapesAssignment { // main class

    public static void main(String[] args) {
         ArrayList <Shape> shapes = new ArrayList (); 

         Shape Circle = new Circle(8.0);
          Shape Rectangle = new Rectangle(4.0, 6.0); // here are objects using the shape class
           Shape Square = new Square(5.0);

 
          //added all of my shapes in my polymorphic arraylist
           shapes.add(Rectangle);
           shapes.add(Circle);
           shapes.add(Square);
           System.out.println(Rectangle.compareTo(Square));
           
             greatestArea(shapes);
        
    }
    
    
    public static void greatestArea(ArrayList <Shape> shapes){
        
        double highestArea = 0;
        
        for (int i =  0; i < shapes.size(); i++){ // to transverse arraylisst
            System.out.println("Area " + shapes.get(i).getArea());
            
          if (shapes.get(i).getArea() > highestArea){ // if the area is bigger then the inital value of 0
              
              highestArea = shapes.get(i).getArea(); // the "new" inital value is sent in the highest area variable

          }
      } 
         System.out.println("The highest area is " + highestArea);

    }
    
}
