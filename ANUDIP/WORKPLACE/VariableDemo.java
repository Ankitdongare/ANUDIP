// types of a variable
//1.local
//2.instance varibale
//3.static variable
public class VariableDemo {

    float a;//decalartion of variable // instance variable

    public void add() // local variable need to initiize compulsory
    {
        // int a;  // local variable
        System.out.println(a);
    }

    public static void main(String[] args) {
        VariableDemo vb=new VariableDemo();
        vb.add();

    }

}
/*byte   0
short  0
int	0
long   0

boolean false

String  null  -- reference type(non primitive) because string is class

float
//output=0*/
