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
public class KeToan {
    private String ho;
    private String tenDem;
    private String ten;
    private String maNv;
    private String namSinh;
    private String ngayCong;

    public KeToan() {
    }

    public KeToan(String ho, String tenDem, String maNv, String namSinh, String ngayCong) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.maNv = maNv;
        this.namSinh = namSinh;
        this.ngayCong = ngayCong;
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

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(String ngayCong) {
        this.ngayCong = ngayCong;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    
    
    @Override
    public String toString() {
        return "KeToan{" + "ho=" + ho + ", tenDem=" + tenDem + ", maNv=" + maNv + ", ngayCong=" + ngayCong + '}';
    }
    
    
}
