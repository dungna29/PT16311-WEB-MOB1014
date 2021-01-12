/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LamQuenVoiJava;

import java.util.Scanner;//Được import thêm

/**
 *
 * @author Dungna29
 */
public class B4_NhapXuatDuLieuTuBanPhim {

    /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
     */
    public static void main(String[] args) {
        //1. Xuất dữ liệu ra màn hình
        int year = 2021;
        String name = "Duy";
        System.out.print("JAVA 1");
        System.out.println("Chào các bạn đến với năm học " + year);
        System.out.println("Chào bạn " + name + " đến với với năm học " + year);
        System.out.println("Chào bạn " + name + " đến với với năm học " + year);

        //Đưa ra 1 template hiển thị ra màn hình 
        // Tìm hiểu thêm: %f, %s, %d.....
        System.out.printf(" \t Chào bạn %s đến với  \n năm học %d ", name, year);

        //1. Nhập dữ liệu ra màn hình
        Scanner sc = new Scanner(System.in);//Khai báo
        String name2;
        int year2;
        System.out.println("-----------------------");
        System.out.println("Mời bạn nhập tên vào: ");
        name2 = sc.nextLine();//sc.nextLine() hứng chuỗi do người dùng nhập vào
        System.out.println("Mời bạn nhập năm học vào: ");
        year2 = sc.nextInt();
        System.out.printf(" Chào bạn %s đến với năm học %d ", name2, year2);
        
        /*
        Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
        
        Bài 2: Viết chương trình máy tính bỏ túi cộng 5 số nguyên sau đó in kết quả
        và những số đó ra màn hình.
        so1 + so2 + so3 + so4 + so5 = kết quả.   
        */
        
    }
}
