/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

/**
 *
 * @author DungNAPC
 */
public class SinhVien {
    
    private String ten;
    private String maSv;
    private int tuoi;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, String maSv, int tuoi, double diem) {
        this.ten = ten;
        this.maSv = maSv;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", maSv=" + maSv + ", tuoi=" + tuoi + ", diem=" + diem + '}';
    }
    
}
