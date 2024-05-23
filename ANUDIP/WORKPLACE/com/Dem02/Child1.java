package com.Dem02;

class Parent1{
    String name;

    public  void details(){
        name = "Parent";
        System.out.println(name);
    }
}
public class Child1 extends Parent1 {
String name;
    public  void details(){
        super.details();
        name = "Child";
        System.out.println(name);
    }
    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.details();
    }
}
