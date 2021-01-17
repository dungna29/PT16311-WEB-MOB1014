/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B1_Array {

    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
     */
    public static void main(String[] args) {
        //1. Khởi tạo mảng
        int[] arrNumber;
        int arrNumber1[];
        arrNumber = new int[5];

        String[] arrName = new String[5];

        double arrDiem[] = new double[]{8.9, 9.2, 53, 6.3};

        var arrName2 = new String[5];
        var arrName3 = new String[]{"Long", "Hoàng"};

        //2. Gán giá trị cho mảng
        //arrNumber = 5;//Sai vì không xác định lưu giá trị 5 vào vị trí nào
        arrNumber[0] = 5;
        arrNumber[1] = 10;
        arrNumber[0] = 8;//Ghi đè lên giá trị của vị trí đã có

        //4. Lấy 1 giá trị ra
        System.out.println(arrNumber[0]);
        System.out.println("---------------");

        //3. Sử dụng vòng lặp để in giá trị ra màn hình
        // a) For
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println(arrNumber[i]);
        }

        // b) Foreach
        for (var x : arrNumber) {
            System.out.println(x);
        }

        // c) while
        int i = 0;
        while (i < arrNumber.length) {
            System.out.println(arrNumber[i]);
            i++;
        }

        //Viết 1 chương trình nhập vào 1 dãy số theo ý của người dùng và in ra màn hình
        //Bước 1: Xác định biến và gọi class
        Scanner sc = new Scanner(System.in);
        int input;
        int[] arrNumberInput;//Khai báo tên mảng chưa khởi tạo mảng

        //Bước 2: Gán giá trị
        System.out.print("Mời bạn nhập số lượng số muốn thêm: ");
        input = sc.nextInt();
        //Sau khi người dùng nhập vào số lượng mong muốn
        //Tiến hành khởi tạo mảng
        arrNumberInput = new int[input];

        //Gán giá trị sử dụng vòng lặp        
        for (int j = 0; j < input; j++) {
            System.out.printf("Mời bạn nhập vào phần tử thứ %d: \n",j);
            arrNumberInput[j] = sc.nextInt();//Gán giá trị cho vị trí của mảng
        }
        
        //Bước 3: Xử lý nghiệp vụ
        for (int x : arrNumberInput) {
            System.out.print(x + "\t");
        }
    }
}
