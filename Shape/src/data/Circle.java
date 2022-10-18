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
public class Circle extends Shape{
    public static final double PI = 3.14;
    private double radius;
    private double radis;

    public Circle(String owner, String color, double radius) {
        super(owner, color);
        this.radius = radius;
    }

    public Circle(double radis, String owner, String color) {
        super(owner, color);
        this.radis = radis;
    }

    

    
    
    

    @Override
    public double getPerimeter() {
        return (radius*2)*PI;
    }

    @Override
    public double getArea() {
        return radius*4;
    }

    @Override
    public void paint() {
         System.out.printf("|%-15s|%-15s|%4.1f|%4.1f|%7.2f|\n", owner, color, radius, getPerimeter(), getArea());
        
    }
    
    
}
