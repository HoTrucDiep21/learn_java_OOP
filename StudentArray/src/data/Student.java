/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class Student {

    private String id;
    private String name;
    private int yob;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
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

    public void inputInf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ID: ");

        String i = sc.nextLine();
        setName(i);

//        id = sc.nextLine();
//        System.out.print("Input Name: ");
//        name = sc.nextLine();
//        System.out.print("Input year of birth: ");
//        yob = sc.nextInt();
//        System.out.print("Input gpa: ");
//        gpa = sc.nextDouble();
    }

    public void showProfile() {
        System.out.printf("|%-8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
    

}
