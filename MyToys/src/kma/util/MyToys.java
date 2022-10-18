/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kma.util;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class MyToys {
    public  static final double VAT_TAX = 5;
    
    public static int inputVAT(){
        do {            
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input VAT tax???");
                
                int tax = Integer.parseInt(sc.nextLine());
                return tax;
                
                
            } catch (Exception e) {
                System.out.println("Data must be Integer!!!!");
            }
        } while (true);
        
       
    }

   
}
