/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        //Phần 1: Gọi đối tượng để sử dụng thì cần biết tên của đối tượng
        //GiaoVien gv1 = new GiaoVien();//Khởi tạo ra 1 đối tượng giáo viên
        //Gán giá trị cho thuộc tính của đối tượng bằng cách gọi tên biến đối tượng và chấm
        //gv1.tenGV = "Minh";
        //gv1.maGV = "Minhdq";
        //In giá trị của thuộc tính ra màn hình
        //System.out.println(gv1.tenGV + " " + gv1.maGV);

        //Phần 2: Contructor không tham số
        //Trong trường hợp class đối tượng chưa khởi tạo Contructor thì java sẽ khởi tạo ngầm 1 contructor không tham số
        GiaoVien gv2 = new GiaoVien();
        //Gán giá trị
        //gv2.tenGV = "Minh";
        //gv2.maGV = "Minhdq";

        //Phần 3: Contructor có tham số
        //Phải gán giá trị cho đối tượng ngay khi dùng
        //Các vị trí của giá trị phải tương với với vị trí tham số truyền vào và kiểu dữ liệu
        GiaoVien gv3 = new GiaoVien("Thiện", "ThienTH3", 1234, 30, "Nam");
        //System.out.println(gv3.tenGV);

        //Phần 4: Khi Private tất các thuộc tính
        GiaoVien gv4 = new GiaoVien();
        //Sử dụng Setter để gán giá trị
        gv4.setTenGV("Dũng");
        gv4.setTuoi(32);

        //Sử dụng Getter để lấy giá trị
        System.out.println(gv4.getTenGV() + " " + gv4.getTuoi() + " " + gv4.getSchool());
        System.out.println(gv3.toString());

        //Yêu cầu tạo 2 đối tượng 1 bằng contructor không tham số và có tham số sau đó in ra màn hình 2 đối tương
        GiaoVien gv5 = new GiaoVien("Thiện", "ThienTH3", 1234, 30, "Nam");
        GiaoVien gv6 = new GiaoVien();
        gv6.setTenGV("Dũng");
        gv6.setTuoi(32);
        System.out.println(gv5.toString());
        System.out.println(gv6.toString());

    }
}
