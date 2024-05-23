public class Operation {
    public void add(int a,int b){
        int result = a+b;
        System.out.println(result);
    }
    public void add(int a,int b,int c){
        int result = a+b+c;
        System.out.println(result);
    }
    public void add(float a,int b,int c){
        float result = a+b+c;
        System.out.println(result);
    }
    class Operation2 extends Operation{
        public void add(int a,int b){
            int result = a+b;
            System.out.println(result);
        }
        public void add(int a,int b,int c){
            int result = a+b+c;
            System.out.println(result);
        }
        public void add(float a,int b,int c){
            float result = a+b+c;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Operation op = new Operation();
        op.add(5,6);
        op.add(4,5,6);
        op.add(5.4f,4,5);
    }
}
