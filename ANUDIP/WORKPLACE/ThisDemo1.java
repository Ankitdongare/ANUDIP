class Student {
    int rollno;
    String name;
    Float fees;

    public Student(int rollno, String name, Float fees) {
        this.rollno = rollno;   // this indicate current class,current varible , current data member
        this.name = name;
        this.fees = fees;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fees);
    }
}

    public class ThisDemo1 {
    public static void main(String[] args) {
        Student st = new Student(1,"Aniket",125.0f);    //1st step
        Student st2 = new Student(2,"Vaibhav",254.4f);  //2nd step
        st.display();       //3st step
        st2.display();      //4th step
    }
}
