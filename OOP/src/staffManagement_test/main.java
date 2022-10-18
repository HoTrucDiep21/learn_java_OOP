/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffManagement_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

    static List<CanBo> CanBoList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhapTT();
                    break;

                case 2:
                    timKiem();

                    break;
                case 3:
                    xuatTT();
                    break;
                case 0:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }

        } while (chon != 0);

    }

    static void menu() {
        System.out.println("1. Nhap thong tin cho Can Bo");
        System.out.println("2. Tim kiem bang ten");
        System.out.println("3. Hien thi thong tin");
        System.out.println("0. Thoat!");
        System.out.println("Nhap lua chon: ");
    }

    static void nhapTT() {
        System.out.println("Nhap so luong can bo can them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            CanBo cb = createCanBo();
            CanBoList.add(cb);
        }
    }

    static CanBo createCanBo() {
        CanBo cb = null;
        System.out.println("1. Nhap thong tin cho Cong Nhan");
        System.out.println("2. Nhap thong tin cho Ki Su");
        System.out.println("3. Nhap thong tin cho nhan vien Phuc Vu");
        System.out.println("0. Thoat!");
        System.out.println("NHap lua chon: ");
        int n = Integer.parseInt(sc.nextLine());
        switch (n) {
            case 1:
                cb = new CongNhan();
                break;
            case 2:
                cb = new KySu();
                break;
            case 3:
                cb = new NVPhucVu();
                break;
            case 0:
                System.out.println("Thoat!!!");
                break;
        }
        cb.nhap();
        return cb;

    }

    static void timKiem() {
        System.out.println("Nhap can bo can tim kiem: ");
        String ten = sc.nextLine();

        CanBoList.forEach((cb) -> {
            if (cb.getTen().equalsIgnoreCase(ten)) {
                cb.Xuat();
            }

        });
    }

    static void xuatTT() {
        CanBoList.forEach((cb) -> {
            cb.Xuat();
        });
    }
}
