package OOPS;

public class Static_Block {

    static {
        System.out.println("Good Morning");
    }

    static int demo(int n) {
       return n*n;
    } 

    static {
        System.out.println("Good Evening");
    }

    public static void main(String[] args) {
        int res = demo(10);
        System.out.println(res);
    }
}
