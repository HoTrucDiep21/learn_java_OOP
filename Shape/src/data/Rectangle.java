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
public class  Rectangle extends Shape{
    
    private double length, width;

    public Rectangle(String owner, String color, double length, double width) {
        super(owner, color);
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
        return ( length + width ) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void paint() {
         System.out.printf("|%-15s|%-15s|%4.1f|%4.1f|%4.1f|%7.2f|\n", owner, color, length, width, getPerimeter(), getArea());
    }
    
}
