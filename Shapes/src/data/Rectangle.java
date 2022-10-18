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
public class Rectangle extends Shape{
    protected double length, width;

    public Rectangle( String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (width+length) * 2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void showResult() {
        System.out.printf("|%-10s|%-10s|%4.1f|%4.1f|%4.1f|\n", name, color, width, length, getArea());
    }
    
    
    
    
}
