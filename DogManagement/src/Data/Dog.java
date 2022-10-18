/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author PC TGDD
 */
public class Dog {
    private String name;
    private int yob;
    private double weight;
    
    public  Dog(String iName, int iyob, double iweight){
        name = iName;
        yob = iyob;
        weight = iweight;
    }
    
    public  void bark(){
        //System.out.println("Gau gau gau...My name is"+ name);
       // System.out.println("Gau gau gau ...My year of Birth"+ yob);
        System.out.printf("|gau gau gau...|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
} 
