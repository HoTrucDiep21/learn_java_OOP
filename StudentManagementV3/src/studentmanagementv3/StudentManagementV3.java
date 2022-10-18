/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementv3;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class StudentManagementV3 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cabinet stCab = new Cabinet("Student", "Blue");
        printMenu();
        int choice;
        System.out.println("Input choice: ");
        choice = Integer.parseInt(sc.nextLine());
        do {
            printMenu();
            System.out.print("Input your choice (1..6): ");
            choice = Integer.parseInt(sc.nextLine()); //MyToys 
            //if (choice == 1) thì làm gì, == 2 thì làm gì == 3 thì làm gì
            switch (choice) {
                case 1:
                    stCab.AddStudent();
                    break;
                case 2:
                    stCab.PrintList();
                    break;
                case 3:
                    stCab.SearchName();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1..6 to play with");
                    break;

            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("----------------Menu---------------");
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following funtions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile"); //XÓA KO HẲN LÀ XÓA, XÓA LÀ ẨN
        System.out.println("6. Quit");
        System.out.println("----------------End---------------");
    }

}
