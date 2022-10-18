/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffManagement_test;

import java.util.Scanner;

/**
 *
 * @author PC TGDD
 */
public class CongNhan extends CanBo{
    public static  final int BAC = 7;
    int bac;

    public CongNhan() {
    }

    public CongNhan(int bac, String ten, String ngaySinh, String gioiTinh, String diaChi) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Cap bac: "+this.bac);
    }

   

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bac cua cong nhan: ");
        bac = Integer.parseInt(sc.nextLine());
    }
    
    
}
