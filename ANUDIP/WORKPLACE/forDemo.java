public class forDemo {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("The value is : "+i);

             }

        System.out.println("______________________________________________________________________________________________");


        int a=10;//initialization
        while(a <20){ //condition
            a++;//increment operator
            System.out.println("the value is "+a);

            /* A for loop is used when you know the number of iterations ahead of time,
             while a while loop is used when you don't know the number of iterations ahead of time*/

        }
        System.out.println("________________________________________________________________________________________________");
        // do while is also called entry and exit level loop
        int b = 10;
        do {
            System.out.println("value of x = " + b);
            b++;
        }while (b<20);
    }
}
