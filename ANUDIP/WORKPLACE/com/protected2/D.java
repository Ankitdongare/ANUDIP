package com.protected2;

import com.protected1.A;

public class D extends A {
    void MethodOfD(){
        A a = new A();
     //   System.out.println(a.i);

//        a.MethodOfA(); //protected field can be used in the package (methods and data members)
//        A.B b = new A.B();
    }

}
