/* Java divides the operators into the following groups:

Arithmetic operators
+ - *,/ %, ++ --

increment operator   decrement operator
++              	--
Assignment operators
Comparison operators
< > <= >= !=
Logical operators
Bitwise operators
 */
public class IncDecOperatorDemo {

    public static void main(String[] args) {

 //   increment operator ++  decrement operator --
     int x=5;


   	System.out.println(x); // output 5;
   	x++; // increment operator will increment the value by 1
   	System.out.println(x);//output 6
   	System.out.println(x++); //output 6
   	System.out.println(x);//output 7
   	--x;
   	System.out.println(x);//output 6
   	System.out.println(--x);//output 5



    }

}
