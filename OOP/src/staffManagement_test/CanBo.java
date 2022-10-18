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
public class CanBo {

    String ten, ngaySinh, gioiTinh, diaChi;

    public CanBo() {
    }

    public CanBo(String ten, String ngaySinh, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    
    public void Xuat() {

        System.out.println("Ten nhan vien: " + this.ten);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Dia chi: " + this.diaChi);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();

    }

}
