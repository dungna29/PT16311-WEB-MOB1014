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
public class Person {//Lớp Person là lớp cha
    private String ho;
    private String tenDem;
    private String ten;    
    private String namSinh;

    public Person() {
    }

    public Person(String ho, String tenDem, String ten, String namSinh) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Person{" + "ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", namSinh=" + namSinh + '}';
    }
   
    void inRaManHinhPerson(){
        System.out.println("Đây là phương thức in ra màn hình Person của lớp CHa");
    }
    private void thongTin(){
        
    }
   
    
}
