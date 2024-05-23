import java.util.Arrays;
public class ArrayInJava4 {
    public static void main(String[] args) {
        int[] a= {12, 21, 0, 5, 7};//Declaring and initializing an array of ints
        int[] b=Arrays.copyOf(a, a.length);
        for(int i=0; i<b.length;i++)
        {
            System.out.println(b[i]);   //i=0;  0<5 ; b[0]=12  i++=1
            // i=1;  1<5 ; b[1]=21  i++=2
            // i=2;  2<5 ; b[2]=0  i++=3
            //i=3;  3<5 ; b[3]=5  i++=4 so on
        }
        a[2] = 56;
        System.out.println(b[2]);
    }
}

