/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountBank;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class Account {
    private String code, name, id, phoneNumber;
    private int balance;

    public Account() {
    }

    public Account(String code, String name, String id, String phoneNumber, int balance) {
        this.code = code;
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public  int sendMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input money need Send: ");
        int send = sc.nextInt();
        
        balance = send+balance;
        
        return balance;
    }
    public int withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input money need withdraw: ");
        int withdraw = sc.nextInt();
        balance -= withdraw;
        return balance;
        
    }
}
