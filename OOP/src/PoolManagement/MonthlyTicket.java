/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolManagement;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class MonthlyTicket extends Ticket{
    String customerName, address, avatar;
    Date expiredDate;
    float price;

    public MonthlyTicket() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void input() {
        
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Inpur customer Name: ");
        customerName = sc.nextLine();
        
        System.out.println("Input Customer address: ");
        address = sc.nextLine();
        
        System.out.println("Input Customer Avatar: ");
        avatar = sc.nextLine();
        
        System.out.println("Input ticket Price: ");
        price = sc.nextFloat();
        
        System.out.println("Input Expried Date (dd/mm/yyyy): ");
        String expiredDateStr = sc.nextLine();
        expiredDate = convertStringtoDate(expiredDateStr);
    }
    
    
    
}
