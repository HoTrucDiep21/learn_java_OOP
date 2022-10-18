/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Self;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class Cabinet {
    Scanner sc = new Scanner(System.in);
    private String lable;
    private String color;
//    sout
//    int count = Integer.parseInt(sc.nextLine());
//    Student[] arr = new Student[count];
    
    Student[] arr = new Student[500];
    int count = 0;
    
    

    public Cabinet() {
    }

    public Cabinet(String lable, String color) {
        this.lable = lable;
        this.color = color;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void inputStudent(){
        String id, name;
        int yob;
        double gpa;
        
        //Scanner sc = new Scanner(System.in);
//        System.out.print("Input amount Student you need: ");
//        int count = Integer.parseInt(sc.nextLine());
//        Student[] ds = new Student[count];
        System.out.print("Input ID: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input year of birth: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Integer.parseInt(sc.nextLine());
        
        arr[count] = new Student(id, name, yob, gpa);
        count++;
        
        
       
    }
    
//    public int countSt(){
//        int count = 0;
//        for (int i = 0; i < 500; i++) {
//            if (arr[i] != null) {
//                break;
//            }
//            count++;
//        }
//        return count;
//    }
//    
    public void showInf(){
        
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }
    
    public  void ShortList(){
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                            
                }
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }
    
    public void SearchStudentByName(){
        
        String searchName;
        System.out.println("Input the Name to Search: ");
        searchName = sc.nextLine();
        
        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equalsIgnoreCase(searchName) == true) {
                System.out.println("Student found!!!");
                
                arr[i].showProfile();
                return;
            }
        }
        System.out.println("Don't fount Student in List!!!");
        
    }
    
    public void DeleteStudent(){
        String nameDel;
        System.out.println("Input the Name to delete!!!");
        nameDel = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equalsIgnoreCase(nameDel) == true) {
                arr[i] = null;
                return;
            }
        }
        System.out.println("Don't Name of Student you just Search!!!");
    }
}
