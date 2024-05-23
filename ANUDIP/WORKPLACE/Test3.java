public class Test3 {
                //datatypes
    //primitive         refrence
    //int               string  -class
    //byte              Test3
   // long
    // short


    int a;
    int b;

    Test3(){
        a=10;
        b=20;

    }
    void display(Test3 t1){
        System.out.println("a = "+a+"   " +"b = " +b);
    }
    void get()
    {
        display(this);
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.get();

    }
}
