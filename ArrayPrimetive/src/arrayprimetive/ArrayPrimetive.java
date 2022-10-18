/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprimetive;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class ArrayPrimetive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayPlay();
        playWithArrayV3();
    }

    public ArrayPrimetive() {
    }

    public static void ArrayPlay() {
        int a[] = {0, 1, 6, 7, 3};

        for (int i : a) {
            System.err.print(i + " ");
        }

    }
    
    public static void playWithArrayV3(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("a["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Length = "+arr.length);
         
        
        
        for (int i = 0; i < 5; i++) 
            System.out.print(arr[i]+ " ");
        
    }
}
