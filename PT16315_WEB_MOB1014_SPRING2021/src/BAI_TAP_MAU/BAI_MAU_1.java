/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BAI_MAU_1 {

    /*
    Bài tập : Viết 1 chương trình cho phép người dùng đăng nhập vào được thông qua tài khoản và mật khẩu đúng. 
    Tài khoản mật khẩu các bạn sẽ cho trước. Nếu đăng nhập thành công thì sẽ thực hiện cho phép người dùng nhập
    1 số nằm trong 2 khoảng  từ 10 đến 20 hoặc 90 100. Nếu nhập đúng in ra thông báo nhập thành công và kết thúc 
    chương trình. Nếu người dùng nhập không đúng trong 2 khoảng thì yêu cầu nhập lại.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String user = "dungna", pass = "1";
        String inputUser, passUser;
        boolean resultLogin;
        int inputNumber;
        
        do {            
            System.out.println("*******Đăng Nhập POLY*******");
            System.out.print("User: ");
            inputUser = sc.nextLine();
            System.out.print("Pass: ");
            passUser = sc.nextLine();
            resultLogin = (inputUser.equals(user) && passUser.equals(pass)) ? false : true;
            if (resultLogin) {
                System.out.println("Bạn vui lòng đăng nhập lại");
            }
        } while (resultLogin);
        
        do {            
            System.out.print("Mời bạn nhập số trong khoảng 10 - 20 hoặc 90 - 100: ");
            inputNumber = sc.nextInt();
        } while (!((inputNumber >= 10 && inputNumber <= 20) || (inputNumber >= 90 && inputNumber <= 100)));
        System.out.println("Bạn đã hoàn tất chương trình");
    }
}
