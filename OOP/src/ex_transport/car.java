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
public class car extends transport {

    private String fuelType;

    public car() {
    }

    public car(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    

    public car(String transportType, String brand) {
        super(transportType, brand);

    }
    

    @Override
    public double getSpeed() {
        return 150;
    }

}
