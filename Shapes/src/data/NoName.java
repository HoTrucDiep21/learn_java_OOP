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
public class NoName extends Shape{

    public NoName(String name, String color) {
        super(name, color);
    }

    @Override
    public double getPerimeter() {
        return 50;
    }

    @Override
    public double getArea() {
        return 100;
    }

    @Override
    public void showResult() {
        System.out.printf("|%-10s|%-10s|%4.1f|\n", name, color, getArea());
    }
    
    
    
}
