//
//class Employee {    //when you use getter and setter then you can access private data members called Eancapsulation
//                    //POJO --> Plain Old Java Object
//
//    //static Polymorphism ---> Dynamic Polymorphism
//
//    //early  Binding                 late binding
//    //compile time                  // run time
//    //constructor overloading        //constructor Overriding---no such concept
//    //method overloading             //method Overriding
//
//
//       private String name;
//        private String role;
//
//       public Employee(){   //POJO class    //default Constructor
//
//        }
//    public Employee(String name, String role) {
//        this.name = name;       //NAME POINT TO PARAMERER LIST NAME
//        this.role = role;       //ROLE POINT TO PARAMETER LIST ROLE
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public double calculateSalary() {
//
//           return 0.0;
//
//    }
//
//
//}
//
//class Manager extends Employee{
//
//    private  double baseSalary;
//    private double bonus;
//    private double overtimePay;
//
//    public Manager(double baseSalary, double bonus) {
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//    }
//    public Programmer(double baseSalary,double overtimePay) {
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//        this.overtimePay =overtimePay;
//    }
//
//    public double calculateSalary() {
//        return baseSalary+bonus;
//    }
//    public Manager( double baseSalary, double bonus) {
//        super(name, role);
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//    }
//
//    public Programmer(String name, String role, double baseSalary,double overtimePay) {
//        super(name, role);
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//        this.overtimePay=overtimePay;
//    }
//
//}
//
//
//
//    public  class EmpMain{
//    public static void main(String[] args) {
//        Employee emp = new Employee();
//        Employee emp1 = new Manager(75.00,45.01);
//
//
//        emp.setName("ANU");
//        System.out.println(emp.getName());
//
//        emp.setRole("Developer");
//        System.out.println(emp.getRole());
//
//
//
//
//
//    }
//}
