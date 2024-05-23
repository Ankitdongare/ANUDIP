package com.protected1;

public class A {
   protected int i;
   protected void MethodOfA(){
        {
            System.out.println(i);      //protected field can be use within the class.

        }

    }
    protected class B{

    }
}
class C extends  A{
    void MethodOfC(){
        System.out.println(i);
        A a = new A();
        a.MethodOfA(); //protected field can be used in the package (methods and data members)
        A.B b = new A.B();



    }
}

//class M{
//    MethodOfM(){
//        A a = new A();
//    }
//}