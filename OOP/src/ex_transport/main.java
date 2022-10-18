/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_transport;

/**
 *
 * @author PC TGDD
 */
public class main {
    public static void main(String[] args) {
        manufactureBrand fac1 = new manufactureBrand("Mec", "Gemany");
        manufactureBrand fac2 = new manufactureBrand("Vinfast", "VietNam");
        manufactureBrand fac3 = new manufactureBrand("Rangrove", "England");
        
        transport mec = new car("Transport on land", "Mec");
        transport boing = new plane("gas", "on the air", "Boeing");
        transport gymShart = new bicycle();
        gymShart.setBrand("GymShark");
        
        System.out.println("p1"+mec.getSpeed());
        System.out.println("mec"+mec.getBrand());
        
        
        
        
    }
    
    
}
