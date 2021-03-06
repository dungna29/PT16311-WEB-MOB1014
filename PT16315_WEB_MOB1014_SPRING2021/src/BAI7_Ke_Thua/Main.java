package BAI7_Ke_Thua;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    /*
    TÍNH CHẤT KẾ THỪA TRONG LẬP TRÌNH
    - Định nghĩa: Cho phép định nghĩa một lớp đối tượng dựa trên các thuộc tính có sẵn của một lớp đã có.
    Lớp con có thể kế thừa các thuộc tính và phương thức của lớp cha.
    - Sử dụng: Sử dụng từ khóa extend lớp cha
    - Lưu ý: trong JAVA và C# không có đã kế thừa chỉ có đơn kế thừa. Tức là 1 con chỉ có thể có 1 cha
    - Từ khóa this: tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    - Từ khóa super: tham chiếu đến thuộc tính và phương thức của lớp cha
    + Lợi ích: 
        - Tiết kiệm thời gian lập trình
        - Các thuộc tính chung có thể tái sử dụng thì đưa lên lớp cha còn ở lớp con thì có các thuộc tính
            đặc trưng riêng để miêu tả cho đối tượng đó.
     */
    public static void main(String[] args) {
        /*
        TẠO 4 CLASS ĐỐI TƯỢNG
        1 - SinhVien: ho,tenDem,ten,namSinh,maSv,diemJava
        2 - GiaoVien: ho,tenDem,ten,namSinh,maGv,gioDay
        3 - KeToan: ho,tenDem,ten,namSinh,maNv,ngayCong
        4 - BaoVe: ho,tenDem,ten,namSinh,maBv,caLamViec
         */

        //P1: Sử dụng class đối tượng không kế thừa
        SinhVien1 sv1 = new SinhVien1();
        sv1.setHo("Nguyễn");
        sv1.setTen("Dũng");
        sv1.setTenDem("Anh");
        sv1.setMaSv("dungna");
        sv1.setDiemJava("7");

        //P2: Sử dụng Class đối tượng đã được kế thừa
        SinhVien sv2 = new SinhVien();
        sv2.setHo("Nguyễn");
        sv2.setTen("Dũng");
        sv2.setTenDem("Anh");
        sv2.setMaSv("dungna");
        sv2.setDiemJava(7.6);
        SinhVien sv3 = new SinhVien("dungna", 7.6, "Nguyễn", "Anh", "Dũng", "1999");
        //sv3.inRaManHinh();

        // - Nạp chồng (Overloading) - các phương thức có tên giống nhau nhưng khác tham số sẽ cho ra kết quả khác nhau
        method1();
        method1(0);
        method1(0,1);
        
        //P2: Sử dụng phương thức của lớp cha        
        // - Ghi đè (Overriding): Khi lớp con kế thừa phương thức của lớp cha thì có thể ghi đè lại code trong phương thức của lớp cha.
        Person p = new Person();
        p.inRaManHinhPerson();
        SinhVien sv4 = new SinhVien();
        sv4.inRaManHinhPerson();
    }
    static void method1(){
        System.out.println("Chào tuấn");        
    }
    static void method1(int a){
         System.out.println("Chào huân" + a);
    }
    static void method1(int a, int b){
         System.out.println("Chào trung" + a + b);
    }
}
