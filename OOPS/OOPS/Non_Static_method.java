package OOPS;

// NON - STATIC METHODS

public class Non_Static_method {

    int a;
    static int b;

    void demo(){
        System.out.println(a);
        b = 10;
        System.out.println(b);
        System.out.println("Demo of non static method");
    }

    void driver(){
        System.out.println(a);
        System.out.println(b);
        b = 20;
        System.out.println(b);
        System.out.println("this is Driver of non static method");
    }

    static void runner(){
        System.out.println(b);
        b = 50;
        System.out.println(b);
        System.out.println("this is runner of static method");
    }

    {
       runner();
       demo();
       driver();
    }

    public static void main(String[] args) {
        Non_Static_method m1 = new Non_Static_method();
        m1.driver();
        m1.demo();
    }
}
