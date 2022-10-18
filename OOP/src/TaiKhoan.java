/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC TGDD
 */
public class TaiKhoan {
    private String maTK, tenTK, cmnd, sdt, soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTK, String tenTK, String cmnd, String sdt, String soDu) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.soDu = soDu;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSoDu() {
        return soDu;
    }

    public void setSoDu(String soDu) {
        this.soDu = soDu;
    }
    
    
}
