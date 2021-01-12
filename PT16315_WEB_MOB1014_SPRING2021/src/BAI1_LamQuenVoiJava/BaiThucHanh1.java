/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BaiThucHanh1 {
    public static void main(String[] args) {
        //Bước 1: Khai báo thư viện, xác định số lượng biến
        Scanner sc = new Scanner(System.in);
        String name,msv;
        int ns;
        //Bước 2: Gán giá trị cho biến do người dùng nhập vào
        System.out.print("Mời bạn nhập tên: ");
        name = sc.nextLine();
        System.out.print("Mời bạn nhập năm sinh: ");
        //ns = sc.nextInt();//Nếu next là số thì mặc định sẽ bị trôi lệnh nếu ở dưới là String
        //Khắc phục trôi lệnh
        //Cách 1:
        //sc.nextLine();
        //Cách 2:
        ns = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập mã sinh viên: ");
        msv = sc.nextLine();
        //Bước 3: Xử lý nghiệp vụ
        System.out.printf("Chào bạn: %s | Năm sinh: %d | Msv: %s",name,ns,msv);
    }
}
