/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP_GiaoLang;

/**
 *
 * @author PC TGDD
 */
public class checkPrime {

    public static void main(String[] args) {
        boolean result = checkPrime(100);
        System.out.println("0: " + result);
        System.out.println("100 " + checkPrime(100));
        System.out.println("101 " + checkPrime(101));
        printPrimeList();

    }

    public static void printPrimeList() {
        System.out.println("The list of Prime from 1 ....1000");
        for (int i = 1; i <= 1000; i++) 
            if (checkPrime(i)) 
                System.out.print(i + " ");
            
        

    }

    public static boolean checkPrime(int n) {
        if (n < 2) 
            return false;
        
        if (n == 2) 
            return true;
        
        for (int i = 2; i < Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false;
            
            return true;
        

       

    }
}
