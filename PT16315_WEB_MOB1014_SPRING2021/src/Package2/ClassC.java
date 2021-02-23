/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import Package1.ClassA;

/**
 *
 * @author DungNAPC
 */
public class ClassC {
    void method(){
        ClassA classA = new ClassA();
        classA.a = 1;
        //classA.b = 2; Không thể gán giá trị cho b vì private
        //classA.c = 3; Không thể gán giá trị cho c vì khác package
        //classA.d = 4;
    }
}
