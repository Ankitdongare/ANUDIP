package com.Dem02;

class Parent3{
    String name;

    public  Parent3(String na){

        name= na;
    }
}
public class Child3 extends Parent3 {

    String name;

   public Child3(String n1, String n2){
       super(n1);
        name = n2;

    }
    public  void details(){
        System.out.println(super.name + " "+ name);
    }
    public static void main(String[] args) {
        Child3 ch= new Child3("Parent","Child");
        ch.details();

    }
}
