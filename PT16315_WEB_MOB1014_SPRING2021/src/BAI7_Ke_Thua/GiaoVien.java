/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_Ke_Thua;

/**
 *
 * @author DungNAPC
 */
public class GiaoVien extends Person{
    private String maGv;   
    private String gioDay;

    public GiaoVien() {
    }

    public GiaoVien(String maGv, String gioDay, String ho, String tenDem, String ten, String namSinh) {
        super(ho, tenDem, ten, namSinh);
        this.maGv = maGv;
        this.gioDay = gioDay;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getGioDay() {
        return gioDay;
    }

    public void setGioDay(String gioDay) {
        this.gioDay = gioDay;
    }
    
    void inRaManHinhGiaoVien(){
        
    }
   
}
