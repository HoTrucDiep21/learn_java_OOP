/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racer;

import data.*;

/**
 *
 * @author PC TGDD
 */
public class Racer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //startRacer();
        clbRacer();
    }
    
    public static void startRacer(){
        System.out.println("Achive of Racer");
        Pet d1 = new Dog("PitBull", "Black", 2020);
        d1.showRecord();
        
        Dog d2 = new Dog("ShiBa", "Green", 2022);
        d2.showRecord();
        d2.showHightRecord();
        
        CLBRecer r2 = new Dog("Bitcoin", "Raccer", 2019);
        r2.showHightRecord();
        
        Pet c1 = new Cat("Japan", "Yellow", 2019);
        c1.showRecord();
        
        Cat c2 = new Cat("USA", "white", 2021);
        c2.showRecord();
        
        
        
        CLBRecer r1 = new Motor("YAMAHA", "Blue", 2019);
        r1.showHightRecord();
        
        
        
        //Khai cha new Cha
        Pet p1 = new Pet("Vang", "Red", 2019) {
            @Override
            public double getSpeed() {
                return 40;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%5.1f|\n", name, color, birthday, getSpeed());
            }
        };
        System.out.println("Achive after Sort");
        Pet[] pep = new Pet[]{d1, d2, c1, c2, p1};
        
        for (int i = 0; i < pep.length - 1; i++) {
            for (int j = i+1; j < pep.length; j++) {
                if (pep[i].getSpeed() > pep[j].getSpeed()) {
                    Pet temp = pep[i];
                    pep[i] = pep[j];
                    pep[j] = temp;
                }
            }
        }
        
        
        for (Pet x : pep) {
            x.showRecord();
        }
        
    }
    
    public static void clbRacer(){
        CLBRecer r1 = new Dog("Pitbull", "Red", 2019);
        
        CLBRecer r2 = new Dog("Pitbull", "Yellow", 2019);
        
        CLBRecer r3 = new Dog("Pitbull", "Green", 2021);
        
        CLBRecer r4 = new Dog("Pitbull", "Blue", 2020);
        
        CLBRecer[] racer = new CLBRecer[] {r1, r2, r3, r4};
        
        for (CLBRecer clb : racer) {
            clb.showHightRecord();
        }
        
        System.out.println("After Sort");
        
        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i+1; j < racer.length; j++) {
                if (racer[i].runToDead() > racer[j].runToDead()) {
                    CLBRecer temp = racer[i];
                    racer[i] = racer[j];
                    racer[j] = temp;
                }
            }
        }
        
        
        for (CLBRecer x : racer) {
             x.showHightRecord();
        }
    
    }
        
    
}
