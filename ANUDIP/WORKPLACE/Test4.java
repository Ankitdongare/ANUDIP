public class Test4 {

    void Display(){
        this.Show();    // this---> represent the current class instance
        System.out.println("Display method me huu");

    }
    void Show(){

        System.out.println("Show method me huu");
    }
    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.Display();


    }
}
