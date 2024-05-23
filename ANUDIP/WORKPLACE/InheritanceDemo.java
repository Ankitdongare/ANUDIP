//inheritance
//Single inheritance
//multilevel inheritance
//multiple inheritance
//hirarchical inheritance
//hybrid inheritance



/*class Parent{

    complexion Fair
    height 6
    eyes blue
    hair brown
    edu electronics
}
class Child extends Parent {
    complexion Fair
    height 6
    eyes blue
    hair brown
    edu IT

}*/
          /*  class c{
            private  int i;
            private  void methodOfA(){
                System.out.println(i);
                B b = new B();
            }
            private static class B{

            }
        }*/

    public  class InheritanceDemo{
        public static void main(String[] args) {
            A a = new A();
            System.out.println(a.i);



            class A1 {      //GrandParent
                int i;
            }
            class B extends A1 {            //parent
                int i;        //feature of A
                int j;
            }
            class C extends B {        //child
                int i;       //feature of B
                int j;        ////feature of B
                int k;

            }
        }
    }


















