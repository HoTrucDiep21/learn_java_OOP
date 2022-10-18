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
   public static final double MAX_SPEED = 40;
   
   protected double weight;

    public Cat(String name, int birthday, double weight) {
        super(name, birthday);
        this.weight = weight;
    }

    @Override
    public double run() {
        Random rd = new Random();
        return rd.nextDouble() * Cat.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%4d|%4.1f|%4.1f|\n", name, birthday, weight, run());
    }
   
   
}
