/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
import data.Circle;
import data.Rectangle;
import data.Square;


/**
 *
 * @author PC TGDD
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    Shape[] shape1 = new Shape[9];
    
    public static void main(String[] args) {
        playShapes();
    }
    
    public static void playShapes(){
       // Shape s1 = new Shape();
        
        Rectangle sr1 = new Rectangle("Rectangle", "Pink", 7, 8);
        sr1.paint();
        Rectangle s1 = new Rectangle("Rec", "Blue", 5, 7);
        
        Rectangle sq1 = new Square("Square", "Red", 5);
        sq1.paint();
        
        Circle c1 = new Circle("Circle", "Green", 6);
        
        c1.paint();
       // Shape c2 = new Circle(4, "Circle", "Yelow");
        
        
        
    }
    
    public static void shortShape(){
        for (int i = 0; i < 3; i++) {
            if (shape1) {
                
            }
        }
    }
    
    
    
}
