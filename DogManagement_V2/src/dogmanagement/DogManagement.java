/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogmanagement;

import Data.Dog;

/**
 *
 * @author PC TGDD
 */
public class DogManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog pitbull = new Dog("PitPull", 2020, 5);
        Dog shiba = new Dog("gau gau", 2022, 4);
        System.out.println("shiba details: "+shiba.toString()); 
//shiba.bark();
        //System.out.println("Pitbull: "+pitbull.toString());
    }

}
