//Copying An Array In Java
public class ArrayInJava1 {
    public static void main(String[] args) {

        int[] a= {12, 21, 0, 5, 7};//Declaring and initializing an array of ints
        //int m=3;
        //int n=m;
        int[] b=a; //copying array 'a' to array 'b'

        for(int i=0; i<b.length;i++)
        {
            System.out.println(b[i]);   //i=0;  0<5 ; b[0]=12  i++=1
            // i=1;  1<5 ; b[1]=21  i++=2
            // i=2;  2<5 ; b[2]=0  i++=3
            //i=3;  3<5 ; b[3]=5  i++=4 so on
        }

        a[2]=56;
        System.out.println(b[2]);


        a[4]=100;
        System.out.println(b[4]);


    }
}
