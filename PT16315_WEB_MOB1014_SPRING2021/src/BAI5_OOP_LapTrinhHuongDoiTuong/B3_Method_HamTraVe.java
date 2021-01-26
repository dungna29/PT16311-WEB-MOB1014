package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_HamTraVe {

    /*
         * Hàm không trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: Hàm trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của hàm.
     */
    public static void main(String[] args) {
        int year = 2021;
        //Coi hàm trả về như là 1 giá trị hoặc đối tượng hoặc tập đối tượng...
        //Đã là giá trị thì phải in nó ra màn hình
        System.out.println(getYear() + 1);
        
        //Sử dụng ham trả về dạng tập giá trị
        for (int i = 0; i < getListYears().length; i++) {
            System.out.println(getListYears()[i]);
        }
        for (int x : getListYears()) {
            System.out.println(x);
        }
    }

    //Hàm trả về không tham số - Hàm trả về kiểu dữ liệu nguyên thủy string,int,double....
    static int getYear() {
        int a = 2021;
        //return <đúng kiểu dữ liệu của hàm>;
        return 2021;
    }

    //Hàm trả về không tham số - Hàm trả về 1 tập giá trị: Array,List....
    static int[] getListYears() {
        //int[] arrYears = {1900,1901.....};
        int[] arrYears = new int[2021 - 1900];
        int temp= 0;
        for (int i = 1900; i <= 2021; i++) {
            arrYears[temp] = i;
            temp++;
        }
        
        System.out.println(getSV().ten);
        getSV().inRaManHinh();
        return arrYears;
    }
    
    //Hàm trả về 1 đối tượng
    static SinhVien getSV(){
        //Tạo đối tượng
        SinhVien sv1 = new SinhVien();
        sv1.ten = "FPT";
        return sv1;
    }
    
    
    //int year = tham số phải có kiểu dữ liệu và tên tham số
    static int inRaManHinh1(int year, String name) {
        //Coi các tham số như các là các biến có thể tương tác với nó
        System.out.println("Chúc mừng năm mới " + year + " " + name);
        return 0;
    }
    
    static List<SinhVien> inRaManHinh1(int a, int[] arrNumber,List<String> lstName,SinhVien sv){
        return null;
    }
    
    

}
