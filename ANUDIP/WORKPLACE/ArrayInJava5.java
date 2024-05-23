public class ArrayInJava5 {

    public static void main(String[] args) {

        //assignmnet Opetator =
        //using for loop
        //using copyOf()- Arrays Class
        // clone()

        int[] a= {12,21,0,5,7};//Declaring and initializing an array of ints

        int[] b=a.clone();

        //printing the array eleemnt of b
        for(int i=0;i < b.length; i++)
        {
            System.out.println(b[i]);
        }
        a[2]=56;
        System.out.println(b[2]);
        a[4]=100;
        System.out.println(b[4]);

    }
}
