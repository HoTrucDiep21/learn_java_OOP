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
public class Dog extends Pet{
    public static final double MAX_SPEED = 60;
    Random rd = new Random();

    public Dog(String name, int birthday) {
        super(name, birthday);
    }

    @Override
    public double run() {
        return rd.nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, birthday,run());
    }
    
    
}
