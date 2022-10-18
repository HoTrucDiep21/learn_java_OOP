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
public class NVPhucVu extends CanBo{
    String loaiCongViec;

    public NVPhucVu() {
    }

    public NVPhucVu(String loaiCongViec, String ten, String ngaySinh, String gioiTinh, String diaChi) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.loaiCongViec = loaiCongViec;
    }

   

    public String getLoaiCongViec() {
        return loaiCongViec;
    }

    public void setLoaiCongViec(String loaiCongViec) {
        this.loaiCongViec = loaiCongViec;
    }

    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("Loai cong viec: "+loaiCongViec);
    }

    

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai cong viec cho cong nhan:  ");
        loaiCongViec = sc.nextLine();
    }
    
}
