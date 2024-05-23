//Array Of Objects In Java
//Array can hold the references to any type of objects.
//It is important to note that array can contain only references to the
//objects,not the objects itself.

/*          object1 obj2 obj3
 *
 *           1st 2nd 3rd 4th 5th  - references
 * */

/*
primitive data types   referenec data type
int[]= {3,4,1,'A'}        String[]= {"padmaja","Aniket","Mayue"}  // predefined class
short[]                   Employee[] emp= {(1,"padmaja","Mumbai",234.43),
		                                   (3,"Aniket","Nagpur",311122),
		                                    4,true,"Mayur, "Pune","A");
}
float[]
double[]
 char[]
	10 employees
class Employee  // user defined class
{
	int id;
	String name;
	String add;

	float sal;


	Employee emp=new Employee();
	EMployee emp;//reference varibale
	new Employee()//instance of a clASS
}
class Department
{

}
class Project
{

}
*/
class A
{
    int i;
}

public class ArrayInJava6 {

    public static void main(String[] args) {

		/*ArrayInJava6 ar=new ArrayInJava6(); // object

		ArrayInJava6 ar1; // type (ArrayInJava6)- reference variable

		new ArrayInJava6(); //instance of a class*/

        A[] a;  //declaring the arrya refernce variable
        a=new A[5]; //creating an array object containing 5 refernces to A-Type objects

        a[1]=new A();//creating an object of an A-Type and assigning to the element at index 1

        a[3]=new A();//creating an object of an A-Type and assigning to the element at index 3



    }

}
