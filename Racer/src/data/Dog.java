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
public class Dog extends Pet implements CLBRecer{
    public static final double MAX_SPEED = 60;

    public Dog(String name, String color, int birthday) {
        super(name, color, birthday);
    }
    
    

    @Override
    public double getSpeed() {
        Random rd = new Random();
        return rd.nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%5.1f|\n", name, color, birthday, getSpeed());
    }

    @Override
    public double runToDead() {
        Random rd = new Random();
        
        return getSpeed() * MAX_SPEED * 3;
    }

    @Override
    public void showHightRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%5.1f|%5.1f|\n", name, color, birthday, getSpeed(), runToDead());
    }
    
    
}
