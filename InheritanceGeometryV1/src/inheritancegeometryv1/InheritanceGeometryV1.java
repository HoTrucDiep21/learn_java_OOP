/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancegeometryv1;
import data.RightTriangle;
import data.Triangle;

/**
 *
 * @author PC TGDD
 */
public class InheritanceGeometryV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithTriangle();
    }
     public  static void playWithTriangle(){
         Triangle tr1 = new Triangle("Triangle", "Blue", 3, 4, 5);
         
         tr1.paint();
         
         Triangle tr2 = new Triangle("Triangle", "Pink", 4, 8, 9);
         tr2.paint();
         
         Triangle rt1 = new RightTriangle("RightTriangle", "Green", 3, 5);
         rt1.paint();
         
         Triangle rt2 = new RightTriangle("RightTriangle", "Red", 7, 8);
         rt2.paint();
         ((RightTriangle)rt2).sayHi();
         
         RightTriangle rt3 = new RightTriangle("Right", "Yellow", 9, 5);
         rt3.paint();
     }
}
