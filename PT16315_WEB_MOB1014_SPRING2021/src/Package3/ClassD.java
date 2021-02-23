/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package3;

import Package1.ClassA;

/**
 *
 * @author DungNAPC
 */
public class ClassD extends ClassA {

    void method() {
        a = 1;
        //classA.b = 2; Không thể gán giá trị cho b vì private
        //classA.c = 3; Không thể gán giá trị cho c vì khác package
        d = 4;
    }
}
