/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author DungNAPC
 */
public class GiaoVien {

    //Phần 1: Khai báo tất cả các thuộc tính phải có của đối tượng thì phải PRIVATE CÁC THUỘC TÍNH
    private String tenGV;
    private String maGV;
    private long sdt;
    private int tuoi;
    private String gioiTinh;
    private String school = "FPOLY";

    /*Phần 2: Tạo 2 Contructor - Hàm Tạo
        + Tên Contructor giống với Class
        + Để tạo Contructor sử dụng phím ALT + INSERT hoặc chuột phải chọn INSERT CODE chọn tiếp CONTRUCTOR
     */
    //1. Tạo Contrcutor không tham số
    //Khi khởi tạo đối tượng sẽ chạy vào contructor đầu tiên
    public GiaoVien() {
        //System.out.println("Đây là text in từ Contrcutor không tham số");
    }

    //2. Tạo Contructor có tham số
    // ALT + INSERT -> Contructor -> Select All
    public GiaoVien(String tenGV1, String maGV, long sdt, int tuoi, String gioiTinh) {
        tenGV = tenGV1;
        this.maGV = maGV;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    //Từ khóa this dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại

    //Phần 3. Khi Private tất các thuộc tính sẽ sử dụng GETTER và SETTER để truy xuất thuộc tính
    // ALT + INSERT -> Getter và Setter -> Select All
    //Get dùng để lấy giá trị của thuộc tính đối tượng
    //Set dùng đẻ gán giá trị cho thuộc tính
    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSchool() {
        return school;
    }
    
    //Phần 4: Các phương thức của đối tượng
    
    //Alt + Insert + toString() 
    //Hàm có sẵn trả về kiểu chuỗi

    @Override
    public String toString() {
        return "GiaoVien{" + "tenGV=" + tenGV + ", maGV=" + maGV + ", sdt=" + sdt + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }
    
    
}
