/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Pet;

/**
 *
 * @author PC TGDD
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startRace();
    }
    
    public static void startRace(){
        Dog pitbull = new Dog("PitBull", 2020);
        pitbull.showRecord();
        
        Pet p1 = new Dog("ShiBa", 2021);
        p1.showRecord();
        
        Pet pc1 = new Cat("Milu", 2019, 7);
        pc1.showRecord();
        
        Cat c1 = new Cat("MiuMiu", 2018, 5);
        c1.showRecord();
    }
    
}
