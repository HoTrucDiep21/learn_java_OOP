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
public abstract class transport {
    String transportType, brand;
    protected manufactureBrand manuBrand;

    public transport() {
    }

    public transport(String transportType, String brand) {
        this.transportType = transportType;
        this.brand = brand;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void start(){
        System.out.println("Transport start...");
    }
    public void acceleration(){
        System.out.println("Transport acceleration...");
    }
    public void stop(){
        System.out.println("Transport has stop...");
    }
    public  abstract double getSpeed();
    
}
