package StudentManagement;

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
    private String id, name;
    int yob;
    double gpa;

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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input birthday: ");
        yob = sc.nextInt();

        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
    }

    public void showInf() {
        System.out.print("ID: " + getId());
        System.out.print("Name: " + getName());
        System.out.print("Birthday: " + getYob());
        System.out.print("GPA: " + getGpa());
    }
}
