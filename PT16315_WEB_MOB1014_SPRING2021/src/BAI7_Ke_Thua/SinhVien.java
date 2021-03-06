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
public class SinhVien extends Person{//Sử dụng từ khóa extends để kế thừa lớp cha
    
    private String maSv;   
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String maSv, double diemJava, String ho, String tenDem, String ten, String namSinh) {
        super(ho, tenDem, ten, namSinh);
        this.maSv = maSv;
        this.diemJava = diemJava;
    }    

   
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    
   
    
    @Override
    public String toString() {        
        return "SinhVien{" + "maSv=" + maSv + ", diemJava=" + diemJava + '}';
    }
    
    //ALT + INSER -> OVERDIDE METHOD -> PHƯƠNG THỨC LỚP CHA
    
    @Override
    void inRaManHinhPerson(){       
        //super.inRaManHinhPerson();   
        System.out.println("Đâu là phương thức in ra màn hình của Sinh Viên");
    }

    void inRaManHinhSinhVien() {
        super.inRaManHinhPerson();
    }
    
    
}
