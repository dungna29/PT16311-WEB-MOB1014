/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B5_BaiTap_BangCuuChuong {

    /*
    Viết 1 chương trình cho phép người dùng nhập vào 1 bảng cửu
    chương sau đó in ra màn hình bằng 3 kiểu vòng lặp.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Mời bạn nhập bảng cửu chương: ");
        input = sc.nextInt();
        System.out.println("Bảng cửu chương nhân " + input);
        //Cách 1: Dùng for
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d \n", input, i, input * i);
        }

        //Cách 2: Dùng While
        System.out.println("----------While-------------");
        int i = 1;
            while (i<10) {
            System.out.printf("%d x %d = %d \n", input, i, input * i);
            i++;
        }

        //Cách 3: Do...While
        System.out.println("----------Do While-------------");
        int j = 1;
        do {
            System.out.printf("%d x %d = %d \n", input, j, input * j);
            j++;
        } while (j < 10);

        //In tất cả bảng cửu chương bằng While - a x b = c
        int a = 1, b = 1;
        while (a <= 10) {
            System.out.println("Bảng nhân: " + a);            
            b = 1;//Reset b về trạng thái ban đầu để có thể triển khai nhân trong While 
            //tiếp theo
            while (b <= 9) {                
                System.out.printf("%d x %d = %d \n", a, b, a * b);
                b++;
            }
            a++;
        }

    }
}
