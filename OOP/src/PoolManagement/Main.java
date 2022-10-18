/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolManagement;

import java.util.Scanner;
import sun.awt.datatransfer.DataTransferer;

/**
 *
 * @author PC TGDD
 */
public class Main {
    public static void main(String[] args) {
            Scanner sc = new  Scanner(System.in);
            int choose;
            
            do {     
                showMenu();
                choose = Integer.parseInt(sc.nextLine());
                
                switch(choose){
                    case 1:
                        SwimmingPool swimingPool = new SwimmingPool();
                        swimingPool.input();
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                        default:
                            break;
                }
            
        } while (choose != 6);
    }
    
    static  void showMenu(){
        System.out.println("1. Add swimming poll");
        System.out.println("2. Add Monthly Ticket");
        System.out.println("3. Booking");
        System.out.println("4. Statictis profit of day by Daily Ticket");
        System.out.println("5. Statictis profit of month");
        System.out.println("6. Exit!!!");
        System.out.println("Input choose: ");
        
    }
}
