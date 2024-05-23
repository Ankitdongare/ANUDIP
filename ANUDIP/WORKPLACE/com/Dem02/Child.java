package com.Dem02;
//Super keyword is used to refer to imidiate parent class
class GrandParent{
    String name;
}

class Parent extends GrandParent{
    String name;
}

public class Child extends  Parent{
    String name;

    public  void Details(){
       super.name = "Parent";     //parent
        name = "Child";     //Child
        System.out.println(super.name +" "+ name);
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.Details();


    }
}
