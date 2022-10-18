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
    private static final double PI = 3.14;
    
    protected double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (radius*2) * PI;
    }

    @Override
    public double getArea() {
        return (radius*radius )* PI;
    }

    @Override
    public void showResult() {
        System.out.printf("|%-10s|%-10s|%4.1f|%4.1f|\n", name, color, radius, getArea());
    }
    
    
}
