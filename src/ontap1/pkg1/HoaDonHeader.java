/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap1.pkg1;

import java.util.Calendar;

/**
 *
 * @author hoang
 */
public class HoaDonHeader {

    public HoaDonHeader() {
    }
    int MaHoaDon ;
    Calendar NgayBan;
    String TenKH; 

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public Calendar getNgayBan() {
        return NgayBan;
    }

    public String getTenKH() {
        return TenKH;
    }

    public HoaDonHeader(int MaHoaDon, Calendar NgayBan, String TenKH) {
        this.MaHoaDon = MaHoaDon;
        this.NgayBan = NgayBan;
        this.TenKH = TenKH;
    }

    @Override
    public String toString() {
        return "HoaDon: {" + "MaHoaDon=" + MaHoaDon + ",\n NgayBan=" + NgayBan.get(Calendar.DAY_OF_MONTH) + "" +NgayBan.get(Calendar.MONTH) +""+NgayBan.get(Calendar.YEAR) + ", \nTenKH=" + TenKH + "} \n";
    }
    
}
