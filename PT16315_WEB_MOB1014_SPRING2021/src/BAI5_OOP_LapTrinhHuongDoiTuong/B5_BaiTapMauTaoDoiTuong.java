/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class B5_BaiTapMauTaoDoiTuong {

    Scanner _sc = new Scanner(System.in);
    String _input;
    List<GiaoVien> _lstGiaoViens = new ArrayList<>();
    GiaoVien _giaoVien;

    /*
        Tạo mới nhiều nhiều và 1 đối tượng
     */
    public static void main(String[] args) {
        B5_BaiTapMauTaoDoiTuong b5 = new B5_BaiTapMauTaoDoiTuong();
        //b5.tao1DoiTuong();
        //b5.taoNhieuDoiTuong();
        b5.taoNhieuDoiTuongNangCao();

    }

    void tao1DoiTuong() {
        _giaoVien = new GiaoVien();
        System.out.print("Mời bạn nhập tên giáo viên: ");
        _giaoVien.setTenGV(_sc.nextLine());
        System.out.print("Mời bạn nhập tên Mã GV: ");
        _giaoVien.setMaGV(_sc.nextLine());
        System.out.print("Mời bạn nhập tên SĐT: ");
        _giaoVien.setSdt(Long.parseLong(_sc.nextLine()));
        System.out.print("Mời bạn nhập tên TUỔI: ");
        _giaoVien.setTuoi(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập tên Giới Tính: ");
        _giaoVien.setGioiTinh(_sc.nextLine());
        System.out.println(_giaoVien.toString());
    }

    void taoNhieuDoiTuong() {
        System.out.print("Mời bạn nhập số lượng GV muốn thêm: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _giaoVien = new GiaoVien();
            System.out.print("Mời bạn nhập tên giáo viên: ");
            _giaoVien.setTenGV(_sc.nextLine());
            System.out.print("Mời bạn nhập tên Mã GV: ");
            _giaoVien.setMaGV(_sc.nextLine());
            System.out.print("Mời bạn nhập tên SĐT: ");
            _giaoVien.setSdt(Long.parseLong(_sc.nextLine()));
            System.out.print("Mời bạn nhập tên TUỔI: ");
            _giaoVien.setTuoi(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập tên Giới Tính: ");
            _giaoVien.setGioiTinh(_sc.nextLine());           
            //Thêm đối tượng vào trong List sau khi nhập đủ thông tin của 1 đối tượng
            _lstGiaoViens.add(_giaoVien);
        }
        
        //Xuất danh sách nhiều phần tử trong List dùng vòng lặp
        for (GiaoVien x : _lstGiaoViens) {            
             System.out.println(x.toString());
        }
    }
    void taoNhieuDoiTuongNangCao() {
        System.out.print("Mời bạn nhập số lượng GV muốn thêm: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _giaoVien = new GiaoVien();
            _giaoVien.setTenGV(getInput("Tên Giáo Viên"));          
            _giaoVien.setMaGV(getInput("Tên Mã Giáo Viên"));          
            _giaoVien.setSdt(Long.parseLong(getInput("Số điện thoại")));            
            _giaoVien.setTuoi(Integer.parseInt(getInput("Tuổi")));          
            _giaoVien.setGioiTinh(getInput("Giới Tính"));           
            //Thêm đối tượng vào trong List sau khi nhập đủ thông tin của 1 đối tượng
            _lstGiaoViens.add(_giaoVien);
        }        
        //Xuất danh sách nhiều phần tử trong List dùng vòng lặp
        for (GiaoVien x : _lstGiaoViens) {            
             System.out.println(x.toString());
        }
    }
    String getInput(String name){
        System.out.printf("Mời bạn nhập %s: ",name);
        return _sc.nextLine();
    }
}
