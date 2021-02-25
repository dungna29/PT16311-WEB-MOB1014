/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        //m.tao2DoiTuong();
        //m.tao1DoiTuong();
        m.taoMangDoiTuong();
    }

    //1. Tạo 2 đối tượng bằng contructor tham số và không tham số
    void tao2DoiTuong() {
        //1. Contructor không tham số
        SinhVien sv1 = new SinhVien();//Khởi tạo 1 đối tượng
        sv1.setTen("Dũng");
        sv1.setMaSv("dungna");
        sv1.setTuoi(30);
        sv1.setDiem(4);
        sv1 = new SinhVien();//Khởi tạo lại đối tượng
        System.out.println(sv1.toString());

        //2.  Contructor có tham số
        SinhVien sv2 = new SinhVien("Minh", "MinhDQ", 30, 8);
        System.out.println(sv2.toString());
    }

    //2. Tạo 1 đối tượng bởi người dùng nhập vào
    void tao1DoiTuong() {
        SinhVien sv1 = new SinhVien();
        System.out.println("Mời bạn nhập tên: ");
        sv1.setTen(sc.nextLine());
        System.out.println("Mời bạn nhập ma: ");
        sv1.setMaSv(sc.nextLine());
        System.out.println("Mời bạn nhập tuổi: ");
        sv1.setTuoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời bạn nhập điểm: ");
        sv1.setDiem(Double.parseDouble(sc.nextLine()));

        System.out.println("Bạn vừa nhập thông tin sinh như sau: ");
        System.out.println(sv1.toString());
    }

    //3. Tạo mảng đối tượng
    void taoMangDoiTuong() {
        //Bước 1: Khai báo
        //Công thức khai báo mảng: <Kiểu dữ liệu>[] tên mảng = new <Kiểu dữ liệu>[Kích thước];
        SinhVien[] arrSinhViens;
        int kickThuocMang;

        //Bước 2: Triển khai
        System.out.println("Bạn muốn thêm số lượng SV: ");
        kickThuocMang = Integer.parseInt(sc.nextLine());
        arrSinhViens = new SinhVien[kickThuocMang];//Khởi tạo mảng đối tượng có kích thước do người dùng nhập vào
        for (int i = 0; i < kickThuocMang; i++) {
            arrSinhViens[i] = new SinhVien();
            System.out.println("Mời bạn nhập tên: ");
            arrSinhViens[i].setTen(sc.nextLine());
            System.out.println("Mời bạn nhập ma: ");
            arrSinhViens[i].setMaSv(sc.nextLine());
            System.out.println("Mời bạn nhập tuổi: ");
            arrSinhViens[i].setTuoi(Integer.parseInt(sc.nextLine()));
            System.out.println("Mời bạn nhập điểm: ");
            arrSinhViens[i].setDiem(Double.parseDouble(sc.nextLine()));
        }
        for (SinhVien x : arrSinhViens) {
            System.out.println(x.toString());
        }
    }
    //4. Tạo 1 List Đối tượng

    void taoListDoiTuong() {
        List<SinhVien> lstSinhVien = new ArrayList<>();
        SinhVien sv1;
        int size;

        System.out.println("Bạn muốn thêm số lượng SV: ");
        size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            sv1 = new SinhVien();
            System.out.println("Mời bạn nhập tên: ");
            sv1.setTen(sc.nextLine());
            System.out.println("Mời bạn nhập ma: ");
            sv1.setMaSv(sc.nextLine());
            System.out.println("Mời bạn nhập tuổi: ");
            sv1.setTuoi(Integer.parseInt(sc.nextLine()));
            System.out.println("Mời bạn nhập điểm: ");
            sv1.setDiem(Double.parseDouble(sc.nextLine()));
            lstSinhVien.add(sv1);//Thêm đối tượng vào danh sách sau khi gán xong giá trị
        }
        
        for (SinhVien x : lstSinhVien) {
            System.out.println(x.toString());
        }
        
        /*
            Viết 1 chương trình gồm các chức năng sau
        Class: MaDV,CanNang, Tuoi,ChungLoai
        1. Thêm 1 đối tượng động vật
        2. Thêm nhiều đối tượng
        3. Tạo ra 3 đối tượng ảo
        4. Thoát
        */
    }
}
