/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author PC TGDD
 */
public class Motor implements CLBRecer{
    
    public static final double MAX_SPEED = 300;
    
    private String brand;
    private String color;
    private int date;

    public Motor(String brand, String color, int date) {
        this.brand = brand;
        this.color = color;
        this.date = date;
    }
    
    
   

    @Override
    public double runToDead() {
        Random rd = new Random();
        return rd.nextDouble() * Motor.MAX_SPEED * 3;
    }

    @Override
    public void showHightRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%-5s|%5.1f|\n", brand, color, date," ", runToDead());
    }
    
}
