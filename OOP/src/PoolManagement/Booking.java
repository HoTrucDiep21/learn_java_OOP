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
public class Booking {
    String ticketCode, durationCode;
    Date checkinTime;

    public Booking() {
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getDurationCode() {
        return durationCode;
    }

    public void setDurationCode(String durationCode) {
        this.durationCode = durationCode;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ticket");
        System.out.println("1. Monthly Ticket");
        System.out.println("2. Daily Ticket");
        System.out.println("Input choose: ");
        int choose = Integer.parseInt(sc.nextLine());
        
        switch(choose){
            case 1:
                System.out.println("Input ticket Code: ");
                ticketCode = sc.nextLine();
                
                break;
            default:
                DaylyTicket dailyTicket = new DaylyTicket();
                dailyTicket.input();
                
                ticketCode = dailyTicket.getCodeTicket();
                break;
                
        }
        
        System.out.println("Imput duration Code: ");
        durationCode = sc.nextLine();
        
        checkinTime = new Date();
        
    }
}
