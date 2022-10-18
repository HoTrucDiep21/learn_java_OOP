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
public class plane extends transport{
    String fuelType;
    

    public plane() {
    }

    public plane(String fuelType) {
        this.fuelType = fuelType;
    }

    public plane(String fuelType, String transportType, String brand) {
        super(transportType, brand);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    
    public void takeOff(){
        System.out.println("Plane is taking off...");
    }
    public void landing(){
        System.out.println("Plane is landing...");
    }
    

    @Override
    public double getSpeed() {
        return 500;
    }
    
    
}
