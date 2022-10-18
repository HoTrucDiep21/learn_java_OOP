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
public class DurationTime {

    static List<Character> clList = new ArrayList<>();
    static List<Integer> indexList = new ArrayList<>();

    String durationCode;
    int fromTime, toTime;
    float price;

    public DurationTime() {
    }

    public static List<Character> getClList() {
        return clList;
    }

    public static void setClList(List<Character> clList) {
        DurationTime.clList = clList;
    }

    public static List<Integer> getIndexList() {
        return indexList;
    }

    public static void setIndexList(List<Integer> indexList) {
        DurationTime.indexList = indexList;
    }

    public String getDurationCode() {
        return durationCode;
    }

    public void setDurationCode(String durationCode) {
        this.durationCode = durationCode;
    }

    public int getFromTime() {
        return fromTime;
    }

    public void setFromTime(int fromTime) {
        this.fromTime = fromTime;
    }

    public int getToTime() {
        return toTime;
    }

    public void setToTime(int toTime) {
        this.toTime = toTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        autoGenerateCode();

        System.out.println("input start time: ");
        fromTime = Integer.parseInt(sc.nextLine());

        System.out.println("Input end Time: ");
        toTime = Integer.parseInt(sc.nextLine());

        System.out.println("Input price of Ticket: ");
        price = Integer.parseInt(sc.nextLine());

    }

    public void autoGenerateCode() {
        autoGenerateCharacter();
        durationCode = "";
        for (int i = 0; i < indexList.size(); i++) {
            int currentIndex = indexList.get(i);
            durationCode += String.valueOf(clList.get(currentIndex));
        }
        int lastIndex = indexList.size() - 1;
        indexList.set(lastIndex, indexList.get(lastIndex) + 1);
        for (int i = indexList.size() - 1; i > 0; i++) {

        }
    }

    public void autoGenerateCharacter() {
        if (clList.size() > 0) {
            return;
        }
        for (int i = (int) '0'; i < (int) '9'; i++) {
            clList.add((char) i);
        }
        for (int i = 0; i < 2; i++) {
            indexList.add(0);
        }

    }
}
