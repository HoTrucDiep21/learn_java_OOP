/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC TGDD
 */
public class Student {
    private static String schoolName;
    private  static String id, name;
    int yob;
    double gpa;

    public Student() {
    }

    public Student(String schoolName, String id, String name, int yob, double gpa) {
        this.schoolName = schoolName;
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input id: ");
//        id = sc.nextLine();
//        
//        System.out.print("Input name: ");
//        name = sc.nextLine();
//        
//        System.out.print("Input birthday: ");
//        yob = sc.nextInt();
//        
//        System.out.print("Input gpa: ");
//        gpa = sc.nextDouble();
//    }
    
    public void showInf(){
        System.out.println("School Name: "+getSchoolName());
        System.out.println("ID: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("Birthday: "+getYob());
        System.out.println("GPA: "+getGpa());
    }
    
    public static void sayHi(){
        System.out.println("Hi everyone....!!!!");
    }
}
