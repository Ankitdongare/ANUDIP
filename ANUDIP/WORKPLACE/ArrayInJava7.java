public class ArrayInJava7 {
    static void methodOne(double[] d)
    {
        d[2]=25.45;
        d[5]=35.45;
    }

    public static void main(String[] args) {
        //declaring and creating An array object of double type containing 8 elements

        double[] d=new double[8];

        d[2]= 10.25;// chaing the vlaue of element at index 2
        d[5]= 15.25;// chaing the vlaue of element at index 2
        //ArrayInJava7 ar=new ArrayInJava7();

        methodOne(d);
        System.out.println(d[2]);
        System.out.println(d[5]);
    }
}

