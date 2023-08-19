package OOPS;

public class Employee {

    int empId;
    
    static {
       System.out.println("Tiger jinda hai");
    }
    
    {
        System.out.println("Tiger jinda hai 2");
    }
    
    static {
       System.out.println("Tiger jinda hai 3");
    }

    public static void main(String[] args) {
        System.out.println("====Main methods start=====");
        Employee e1 = new Employee();
        System.out.println(e1.empId);
        System.out.println("====Main methods ends=====");
    }
}
