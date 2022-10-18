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
public abstract class Shape {
     protected String owner;
     protected String color;

    public Shape() {
    }

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }
     
    public abstract double getPerimeter();
    public  abstract  double getArea();
    public  abstract void paint();
    
    public void shortShape(){
         
    }
        
    
}
