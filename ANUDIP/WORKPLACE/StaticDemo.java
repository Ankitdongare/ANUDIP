//flow of java program
public class StaticDemo {

    static int a=0; // static variable// class variable

    public void display()              	//  4th step  8 step       	12step
    {

        a=a+1;                             // 5th step   9 step        	13 step
        //a=3+1; a=3;
        System.out.println(a);         	// 6 step a=0  10th step a=0	a=0 14step
    }
    //a=3;
    public static void main(String[] args) {  //1 step
        StaticDemo sd1=new StaticDemo();	//object created 2 step
        sd1.display();                    // 3 step
        StaticDemo sd2=new StaticDemo();
        sd2.display();                    // 7th step
        StaticDemo sd3=new StaticDemo();
        sd3.display();                     //11th step
//any more statement - no

        //then exit
    }

}
