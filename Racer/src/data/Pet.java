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
public abstract class Pet {
    protected String name, color;
    protected int birthday;

    public Pet(String name, String color, int birthday) {
        this.name = name;
        this.color = color;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    public abstract double getSpeed();
    public abstract void showRecord();
    
    
}
