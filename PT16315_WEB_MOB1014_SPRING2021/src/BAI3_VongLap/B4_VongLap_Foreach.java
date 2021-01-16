/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

/**
 *
 * @author Dungna29
 */
public class B4_VongLap_Foreach {
    /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
    */
    public static void main(String[] args) {
       String arrMonHoc[] = {"Java1","Java2","JAVA3"};
       //foreach
        for (String x : arrMonHoc) {
            System.out.println(x + " ");
        }
       
       //for
        for (int i = 0; i < arrMonHoc.length; i++) {
            System.out.println(arrMonHoc[i] + " ");
        }
    }
}
