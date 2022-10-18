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
public class KySu extends CanBo{
    String linhVuc;

    public KySu() {
    }

    public KySu(String linhVuc, String ten, String ngaySinh, String gioiTinh, String diaChi) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.linhVuc = linhVuc;
    }

    

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Linh vuc: "+linhVuc);
    }

    

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        linhVuc = sc.nextLine();
        
    }
    
}
