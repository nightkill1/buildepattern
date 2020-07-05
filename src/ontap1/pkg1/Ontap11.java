/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap1.pkg1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author hoang
 */
public class Ontap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonHeader hoaDonHeader =new HoaDonHeader(1, new GregorianCalendar(1999, 06, 8), "Nguyễn Minh Hoàng");
        CTHD cthd1 = new CTHD("CPU", 2, 12000, 10);
        CTHD cthd2 = new CTHD("Ram", 3, 14000, 15);
        HoaDon dh1 = new HoaDon.Buider().addHoaDon(hoaDonHeader).addCTHD(cthd1).addCTHD(cthd2).buider();
        System.out.println(dh1.hienThiString());
        
        
        
        
        
    }
    
}
