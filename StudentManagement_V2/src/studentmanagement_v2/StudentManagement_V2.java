/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement_v2;

import data.Student;

/**
 *
 * @author PC TGDD
 */
public class StudentManagement_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("KMA", "123", "Diep", 2003, 9);
        Student st2 = new Student("Hutech", "456", "Nhung", 2002, 8);
        Student st3 = new Student("UFH", "789", "Thuan", 2005, 6);
        
        st3.showInf();
        System.out.println("------------------------------");
        st2.showInf();
        System.out.println("------------------------------");
        st1.showInf();
        
        System.out.println("-----------Say Hi----------");
        st1.sayHi();
        System.out.println("st3 = "+st3.getName());
        System.out.println("st2 = "+st2.getName());
        System.out.println("st1 = "+st1.getName());
        
    }
    
}
