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
public class BAI_MAU_Method {

    static int input, a, b;
    static Scanner sc = new Scanner(System.in);

    /*
        Code lại bài chương trình máy tính của 2 số
     */
    public static void main(String[] args) {
        while (true) {
            switchCase();
        }
    }

    static void menu() {
        System.out.println("Chương trình máy tính POLY");
        System.out.println("1. Phép cộng");
        System.out.println("2. Phép trừ");
        System.out.println("3. Phép nhân");
        System.out.println("3. Phép chia");
    }

    static void switchCase() {
        menu();
        System.out.print("Mời bạn chọn chức năng: ");
        input = sc.nextInt();
        switch (input) {
            case 1:
                nhapHaiSoNguyen();
                System.out.println(congHaiSoTraVe(a, b));
                break;
            case 2:
                nhapHaiSoNguyen();
                congHaiSo(a,b);
                break;
            case 3:
                nhapHaiSoNguyen();
                break;
            case 4:
                nhapHaiSoNguyen();
                break;
            default:
        }
    }

    static void nhapHaiSoNguyen() {
        System.out.print("Mời bạn nhập số a: ");
        a = sc.nextInt();
        System.out.print("Mời bạn nhập số b: ");
        b = sc.nextInt();
    }

    static void congHaiSo(int a, int b) {
        System.out.println(a + b);
    }

    static int congHaiSoTraVe(int a, int b) {
        return a + b;
    }
}
