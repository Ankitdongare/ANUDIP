public class Test1 {
    int a;
    int b;
    Test1(){
        this(10);              // invoke int constructor
        System.out.println("Im in a default constructor");
    }
    Test1(int a,int b){

        this.a=a;
        this.b = b;

        System.out.println("Im in a parameterized constructor");
    }
    Test1(int a){
        this(10,20);       //invoke current class parameterized constructor
        System.out.println("Im in int constructor");
    }
    public static void main(String[] args) {
        Test1 t1 = new Test1();
     //   Test1 t2 = new Test1(0,0);



    }
}
