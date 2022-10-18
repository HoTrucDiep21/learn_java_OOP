/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import data.*;

/**
 *
 * @author PC TGDD
 */
public class Shapes {

   
    public static Shape s1, r1, sq1, c1, anonymous, noName;

    public static void main(String[] args) {
        shortShapes();
    }

    public static void caculatorShapes() {
        s1 = new Rectangle("Rectangle", "Pink", 5, 6);
        s1.showResult();

        r1 = new Rectangle("Rectangle", "Green", 5, 4);
        r1.showResult();

        sq1 = new Square("Square", "Red", 5);
        sq1.showResult();

        c1 = new Circle("Circle", "Blue", 5);
        c1.showResult();
        
        anonymous = new NoName("Anonymous", "Black");
        anonymous.showResult();
        
        noName = new Shape("Noname", "Yellow") {
            @Override
            public double getPerimeter() {
                return 300;
            }
            
            @Override
            public double getArea() {
                return 10;
            }
            
            @Override
            public void showResult() {
                System.out.printf("|%-10s|%-10s|%4.1f|%4.1f|\n", name, color, getPerimeter(), getArea());
            }
        };
        noName.showResult();

    }

    public static void shortShapes() {

        caculatorShapes();
        Shape[] shape = new Shape[]{s1, r1, sq1, c1, anonymous, noName};

        for (int i = 0; i < shape.length - 1; i++) {
            for (int j = i+1; j < shape.length; j++) {
                Shape temp; 
                if (shape[i].getArea() > shape[j].getArea()) {
                   temp = shape[i];
                   shape[i] = shape[j];
                   shape[j] = temp;
                }
                
            }

        }
        System.out.println("After Short");
        for (Shape s : shape) {
            s.showResult();
                    
        }
    }

}
