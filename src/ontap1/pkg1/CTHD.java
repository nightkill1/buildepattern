/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap1.pkg1;

/**
 *
 * @author hoang
 */
public class CTHD  {
    String samPham;
    int sL;
    float donGia;
    float chietKhau;

    public CTHD() {
    }

    public String getSamPham() {
        return samPham;
    }

    public int getsL() {
        return sL;
    }

    public float getDonGia() {
        return donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public CTHD(String samPham, int sL, float donGia, float chietKhau) {
        this.samPham = samPham;
        this.sL = sL;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "samPham=" + samPham + ", sL=" + sL + ", donGia=" + donGia + ", chietKhau=" + chietKhau + '}';
    }
    
}
