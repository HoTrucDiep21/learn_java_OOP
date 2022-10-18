/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoolManagement;

/**
 *
 * @author PC TGDD
 */
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {

    static List<Character> cList = new ArrayList<>();
    static List<Integer> indexList = new ArrayList<>();

    String codeTicket;
    Date registrationDate;

    public Ticket() {
    }

    public Ticket(String codeTicket, Date registrationDate) {
        this.codeTicket = codeTicket;
        this.registrationDate = registrationDate;
    }

    public static List<Character> getcList() {
        return cList;
    }

    public static void setcList(List<Character> cList) {
        Ticket.cList = cList;
    }

    public static List<Integer> getIndexList() {
        return indexList;
    }

    public static void setIndexList(List<Integer> indexList) {
        Ticket.indexList = indexList;
    }

    public String getCodeTicket() {
        return codeTicket;
    }

    public void setCodeTicket(String codeTicket) {
        this.codeTicket = codeTicket;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void autoGenerateCode() {

        codeTicket = "";
        for (int i = 0; i < indexList.size(); i++) {
            int currentIndex = indexList.get(i);
            codeTicket += String.valueOf(cList.get(currentIndex));
        }
        int lastIndex = indexList.size() - 1;
        indexList.set(lastIndex, indexList.get(lastIndex) + 1);
        for (int i = indexList.size() - 1; i > 0; i--) {
            if (indexList.get(i) > cList.size()) {
                break;
            }
            indexList.set(i, 0);
            indexList.set(i - 1, indexList.get(i - 1) + 1);
        }

    }

    public void autoGenerateCharacter() {
        if (cList.size() > 0) {
            return;
        }
        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            cList.add((char) i);
        }
        for (int i = (int) 'A'; i < (int) 'Z'; i++) {
            cList.add((char) i);

        }
        for (int i = (int) '0'; i < (int) '9'; i++) {
            cList.add((char) i);
        }

    }

    public Date convertStringtoDate(String str) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
            return (Date) format.parse(str);
        } catch (ParseException ex) {

        }
        return Date();

    }

    private Date Date() {
        return null;

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        autoGenerateCode();
        System.out.println("Input registration Date: ");
        String registrationStrDate = sc.nextLine();
    }

}
