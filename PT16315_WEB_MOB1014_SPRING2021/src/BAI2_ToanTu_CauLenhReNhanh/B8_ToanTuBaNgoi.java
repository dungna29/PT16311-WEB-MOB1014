/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B8_ToanTuBaNgoi {
    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :
    
    */
    public static void main(String[] args) {
        //Ví dụ 1 mệnh đề toán tử 3 ngôi
        int ketQua1 = 5 > 6 ? 1 : 0;
        float ketQua2 = 5 > 6 ? 1.6f : 0.8f;
        boolean ketQua3 = 5 > 6 ? true : false;
        
        //Trong toán tử 3 ngôi có thể có nhiều mệnh đề
        boolean ketQua4 = (5 > 6) && (5>9) ? true : false;
        
        
        //Toán tử 3 ngôi so sánh với câu lệnh IF ELSE
        String ketQua = 5 > 6 ? "Kết quả đúng" : "Kết quả sai";
        System.out.println(ketQua);
        if (5 > 6) {
            System.out.println("Kết quả đúng");
        }else{
            System.out.println("Kết quả sai");
        }
        
        //Ví dụ đăng nhập vào hệ thống
        while (true) {            
            Scanner sc = new Scanner(System.in);
            String user = "admin", pass = "123", inputUser, inputPass;
            System.out.print("User: ");
            inputUser = sc.nextLine();
            System.out.print("Pass: ");
            inputPass = sc.nextLine();
            String output = inputUser.equals(user) && inputPass.equals(pass)
                    ? "Đăng nhập thành công" : " Đăng nhập thất bại";
            System.out.println(output);
        }
    }
}
