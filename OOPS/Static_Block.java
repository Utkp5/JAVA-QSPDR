package OOPS;

public class Static_Block {

    static {
        System.out.println("Good Morning");
    }

    int demo(int n) {
       return n*n;
    } 

    static {
        System.out.println("Good Evening");
    }

    public static void main(String[] args) {        
        Static_Block Sb = new Static_Block();
        int res = Sb.demo(10);
        System.out.println(res);
    }
}
