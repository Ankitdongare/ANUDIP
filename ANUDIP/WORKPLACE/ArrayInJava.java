public class ArrayInJava {
//Array is a set of values where each value is identified by an index.

    //You can make an array of int’s, double’s, boolean’s
    //or any other types but all the values of array must be of same type
    public static void main(String[] args) {
        //Declaring Arrays In Java :

        //Data_Type[] Variable_Name;
        int[] arrayVariable;// java prefer this syntx

        int arrayVariable1[];

        double doubleVariable[];

        //Instantiating An Array Object :

        int[] arrayVariable2;//Declaring Arrays

        arrayVariable2=new int[10];//Instatiating array

        //int[] arrayVariable2=new int[10];

        //Initializing Array Elements

        int[] arrayVariable3;
        arrayVariable3=new int[10];

        //int ab[]= {2,4,23,5.6,'A',"stat"};

        arrayVariable3[2]=12;
        arrayVariable3[7]=27;
        arrayVariable3[9]=33;
        arrayVariable3[4]=5;
        // accessing array element
        System.out.println(arrayVariable3[3]);
        System.out.println(arrayVariable3[2]);

        //arrayVariable3= {0_0_12  0  5  0  0  0  27    33    }
    }              //      0 1  2  3  4  5  6  7  8  9

}
