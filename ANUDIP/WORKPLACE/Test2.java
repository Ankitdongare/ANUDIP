public class Test2 {
    int a;
    int b;
    Test2(){       // default constructor
      a=10;
      b=20;
    }

    //refrence type
   Test2 get(){
        return  this;
    }
    void  display(){
        System.out.println("a = "+a+" " +"b = " +b);
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();  //object
        Test2 t3 = new Test2();
      //  Test2 t2;         // refrence
       // new Test2();      // instance

        System.out.println(t2.get());       //get test 2 instance
        System.out.println(t3.get());       //get test t3 instance

        t2.display();


    }
}
