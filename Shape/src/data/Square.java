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
public class Square extends Rectangle {
    private double edge;
    
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        this.edge = edge;
    }

    

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    
    

    @Override
    public double getPerimeter() {
        return edge*4; //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public double getArea() {
        return edge*edge; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint() {
        super.paint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
