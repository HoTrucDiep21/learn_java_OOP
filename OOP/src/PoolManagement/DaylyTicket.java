/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolManagement;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class DaylyTicket extends Ticket{
    String durationCode;

    public DaylyTicket() {
    }

    public String getDurationCode() {
        return durationCode;
    }

    public void setDurationCode(String durationCode) {
        this.durationCode = durationCode;
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Input duration Code: ");
        durationCode = sc.nextLine();
    }
    
    
}
