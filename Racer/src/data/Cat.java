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
public class Cat extends Pet{

    public static final double MAX_SPEED = 30;
    
    public Cat(String name, String color, int birthday) {
        super(name, color, birthday);
    }

    @Override
    public double getSpeed() {
        Random rd = new Random();
        
        return rd.nextDouble() * Cat.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%5.1f|\n", name, color, birthday, getSpeed());
    }
    
}
