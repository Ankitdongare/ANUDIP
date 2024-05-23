package com.Demo1;

  class Parent{            //outer Class


     int i;

      void parentMethod()
    {
        System.out.println(i);
        InnerParent ip = new InnerParent();

    }
    class InnerParent            //Inner Class

    {

    }
}

class AnotherClass{
     void anotherMethod(){
         Parent p = new Parent();
       //  System.out.println(i);
         p.parentMethod();
        // Parent.InnerParent ip= new Parent.InnerParent();
     }
}

class Child extends Parent{

     void childMethod(){
         Parent p1 = new Parent();
         System.out.println(p1.i);
     }
}


public class  PrivateDemo{
    public static void main(String[] args) {
        //private, public, default, protected


    }
}
