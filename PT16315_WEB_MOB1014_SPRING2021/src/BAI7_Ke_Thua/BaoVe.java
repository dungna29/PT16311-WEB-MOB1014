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
public class BaoVe {

    private String ho;
    private String tenDem;
    private String ten;
    private String maBv;
    private String namSinh;
    private String caTruc;

    public BaoVe() {
    }

    public BaoVe(String ho, String tenDem, String maBv, String namSinh, String caTruc) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.maBv = maBv;
        this.namSinh = namSinh;
        this.caTruc = caTruc;
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

    public String getMaBv() {
        return maBv;
    }

    public void setMaBv(String maBv) {
        this.maBv = maBv;
    }

    public String getCaTruc() {
        return caTruc;
    }

    public void setCaTruc(String caTruc) {
        this.caTruc = caTruc;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "BaoVe{" + "ho=" + ho + ", tenDem=" + tenDem + ", maBv=" + maBv + ", caTruc=" + caTruc + '}';
    }

}
