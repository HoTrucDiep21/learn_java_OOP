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
public class Cabinet {
    private String lable, color;
    
    private Scanner sc = new Scanner(System.in);
    private Student[] arr = new Student[500];
    private int count = 0;

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
    
    public void AddStudent(){
        String id, name;
        int yob;
        double gpa;
        
        System.out.print("Input ID: ");
        id = sc.nextLine();
        
        System.out.print("Input Name: ");
        name = sc.nextLine();
        
        System.out.print("Input Birthday: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input GPA: ");
        gpa = Integer.parseInt(sc.nextLine());
        
        arr[count] = new Student(id, name, yob, gpa);
        count++;
        
        
    }
    
    public  void PrintList(){
        for (int i = 0; i < count; i++) 
            arr[i].ShowProfile();
        
    }

    
    public void SearchName(){
        String search;
        System.out.print("Input name you need: ");
        search = sc.nextLine();
        
        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equalsIgnoreCase(search) == true) {
                System.out.println("Information of "+search);
                arr[i].ShowProfile();
                return;
            }
        }
        System.out.println("Not found!!!");
    }
    
    
    
    
}
