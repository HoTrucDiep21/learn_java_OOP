/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarray;

import data.Student;
import Self.Cabinet;
import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class StudentArray {

    public static Scanner sc = new Scanner(System.in);
    static int count = 0;
    static Cabinet stCab = new Cabinet();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithObjectStudent();
        // playWithArrayStudent();
        // inPutStudent();
        //addStudent();
        Menu();
    }
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
} 

    public static void Menu() {
        int choose;
        
        do {
            clearScreen();
            System.out.println("-----------Menu---------");
            System.out.println("1. Add a Student");
            System.out.println("2. Delete a Studnet");
            System.out.println("3. Short Student List by GPA");
            System.out.println("4. Search Student in List");
            System.out.println("5. Show Profile");
            System.out.println("-----------End---------");

            System.out.println("Input choose: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    stCab.DeleteStudent();

                    break;
                case 3:
                    stCab.ShortList();
                    //stCab.showInf();
                    break;
                case 4:
                    
                    System.out.println("");
                    stCab.SearchStudentByName();
                    break;
                case 5:
                    Display();
                    break;
                case 0:
                    break;
            }

        } while (choose != 0);
    }

    public static void playWithArrayStudent() {
        // Student st2, st3, st4, st5, st6;

        Student st[] = new Student[100];

        // st[0].inputInf();
//        for (int i = 0; i < st.length; i++) {
//
//            System.out.printf("Input information for Student " + i + "  ");
//            System.out.println();
//            st[i].inputInf();
//        }
        // st[0].setName("Lewiss Dang");
        st[0] = new Student("111", "Asley Dan", 2005, 9);

        st[1] = new Student("112", "Asley Quoc", 2004, 4);
        st[2] = new Student("113", "Asley Bao", 2005, 5);
        st[3] = new Student("114", "Asley Sang", 2006, 8);
        st[4] = new Student("115", "Asley Huy", 2008, 7);
        st[5] = new Student("116", "Asley Dat", 2009, 3);

        for (int i = 0; i < 6; i++) {
            st[i].showProfile();
        }

        for (int i = 0; i < 6 - 1; i++) {
            for (int j = 0; j < 6; j++) {
                if (st[i].getGpa() > st[j].getGpa()) {
                    Student temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }

            }
        }

        //st[2] = new Student("113", "Asley Minh", 2003, 7);
//       
//        System.out.println(st[0]);
        System.out.println("After Sort");

        for (int i = 0; i < 6; i++) {
            st[i].showProfile();
        }
//       

    }

    public static void inPutStudent() {
//        Scanner sc = new Scanner(System.in);
//        String id, name;
//        int yob;
//        double gpa;
//
//        System.out.println("Input amount Student you need: ");
//        int count = Integer.parseInt(sc.nextLine());
//
//        Student[] arr = new Student[count];
//
//        for (int i = 0; i < count; i++) {
//
//            System.out.println("-----------------");
//            
//            System.out.println("Input Student Student " +i+" ");
//            System.out.print("Input ID: ");
//            id = sc.nextLine();
//
//            System.out.print("Input name: ");
//            name = sc.nextLine();
//
//            System.out.print("Input year of birth:  ");
//            yob = Integer.parseInt(sc.nextLine());
//
//            System.out.print("Input gpa: ");
//            gpa = Integer.parseInt(sc.nextLine());
//
//            arr[i] = new Student(id, name, yob, gpa);
//        }
//        System.out.println("---------------------");
//
//        System.out.println("Student inform");
//
//        for (int i = 0; i < count; i++) {
//            arr[i].showProfile();
//        }
//
//        System.out.println("---------------------");
//        System.out.println("After short by gpa");
//        for (int i = 0; i < count - 1; i++) {
//            Student temp = null;
//            for (int j = 1; j < count; j++) {
//                if (arr[i].getGpa() > arr[j].getGpa()) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//            
//        }
//        for (int i = 0; i < count; i++) {
//            arr[i].showProfile();
//        }
//        
//
    }

    public static void showInf() {
        for (int i = 0; i < 10; i++) {

        }
    }

    public static void addStudent() {
        System.out.println("---------------");
        //Cabinet stCab = new Cabinet();
        //System.out.print("Input lable: ");

        stCab.inputStudent();
        count++;

        //stCab.showInf();
    }

    public static void Display() {
        for (int i = 0; i < 1; i++) {
            stCab.showInf();
        }
    }
    
    
    

//    public static void playWithObjectStudent() {
//        Student st1 = new Student("111", "Lewiss Dang", 2003, 8);
//        st1.showProfile();
//    }
}
