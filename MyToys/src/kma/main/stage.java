/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kma.main;

import java.util.Scanner;
import kma.util.MyToys;

/**
 *
 * @author PC TGDD
 */
public class stage {

    public static void main(String[] args) {
        int tax;
//        System.out.println("how much VAT TAX in VietNam??");
//        System.out.println("That is VAT TAX = "+MyToys.VAT_TAX);
        int n = MyToys.inputVAT();
        
        System.out.println("VAT TAX = "+n);
        
    }
}
