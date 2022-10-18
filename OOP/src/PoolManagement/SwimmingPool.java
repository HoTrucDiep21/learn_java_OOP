/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class SwimmingPool {

    List<MonthlyTicket> monthlyTickets = new ArrayList<>();
    List<DaylyTicket> daylyTickets = new ArrayList<>();
    List<DurationTime> durationTimes = new ArrayList<>();
    List<Booking> bookings = new ArrayList<>();

    String code, address;

    public SwimmingPool() {
    }

    public List<MonthlyTicket> getMonthlyTickets() {
        return monthlyTickets;
    }

    public void setMonthlyTickets(List<MonthlyTicket> monthlyTickets) {
        this.monthlyTickets = monthlyTickets;
    }

    public List<DaylyTicket> getDaylyTickets() {
        return daylyTickets;
    }

    public void setDaylyTickets(List<DaylyTicket> daylyTickets) {
        this.daylyTickets = daylyTickets;
    }

    public List<DurationTime> getDurationTimes() {
        return durationTimes;
    }

    public void setDurationTimes(List<DurationTime> durationTimes) {
        this.durationTimes = durationTimes;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input code: ");
        code = sc.nextLine();
        System.out.println("Input address: ");
        address = sc.nextLine();

    }
}
