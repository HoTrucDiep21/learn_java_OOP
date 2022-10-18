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
public class manufactureBrand {
    String brandName, countryName;

    public manufactureBrand() {
    }

    public manufactureBrand(String brandName, String countryName) {
        this.brandName = brandName;
        this.countryName = countryName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    
}
