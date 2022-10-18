/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author PC TGDD
 */
public class RightTriangle extends Triangle{

    public RightTriangle() {
    }

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a*a + b*b));
    }

    @Override
    public void paint() {
         System.out.printf("|---|%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n", owner, color, a, b, c, getArea());
    }
    
    public void sayHi(){
        System.out.println("Fucking money!!!");
    }
    
    
}
