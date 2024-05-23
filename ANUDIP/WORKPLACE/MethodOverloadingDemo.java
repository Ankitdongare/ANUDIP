public class MethodOverloadingDemo { //same name method having different parameters with same class

    int result;
    float Rus;
    public  void add(int a,int b){
        result = a+b;
        System.out.println(result);
    }
    public void add(int a,int b,int c){
        result = a+b+c;
        System.out.println(result);
    }
    public void add(int a, float b,int c,int d){
        Rus= a+b+c+d;
        System.out.println(Rus);
    }
    public static void main(String[] args) {
     MethodOverloadingDemo md = new MethodOverloadingDemo();
     md.add(3,5);
     md.add(2,4,5);
     md.add(3,4.2f,6,7);
    }
}
