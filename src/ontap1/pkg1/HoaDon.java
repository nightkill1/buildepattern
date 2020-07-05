/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap1.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
//Bước 1: Khai báo lớp
public class HoaDon {
     
    HoaDonHeader hoaDonHeader =new HoaDonHeader();
    List<CTHD> listHD = new ArrayList<>();
    //Bước 3: Khời tạo Cotructor có tham số của lớp Buider
    public HoaDon(Buider buider) {
        this.hoaDonHeader = buider.hoaDonHeader;
        this.listHD = buider.listHD;
    }
    
    //Singletain
    private static HoaDon Instance;
    public static HoaDon createInstane(Buider buider)
    {
        if(Instance == null)
        {
            return new HoaDon(buider);
        }
        return Instance;
        
    }
    //Bước 2: Khai báo lớp Buidler
    public static class Buider{
        //Bước 4: trong lớp Buider khởi tạo Phương thức buid()
        public Buider() {
        }
        HoaDonHeader hoaDonHeader = new HoaDonHeader();
        List<CTHD> listHD = new ArrayList();
        public Buider addHoaDon(HoaDonHeader header)
        {
            this.hoaDonHeader = header;
            return this;
        } 
        public Buider addCTHD(CTHD listHD)
        {
            this.listHD.add(listHD);
            return this;
        }
        public HoaDon buider()
        {
            return new HoaDon(this);
        }
    }
   
   public String hienThiString(){
       String hd = hoaDonHeader.toString();
       for(int i =0 ; i< listHD.size();i++)
       {
           hd += listHD.get(i).toString();
        }
       
       return  hd;
   }
   
}
