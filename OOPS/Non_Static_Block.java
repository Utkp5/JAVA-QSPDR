package OOPS;

public class Non_Static_Block {

    {  
        System.out.println("Good");       //this is non-static block     exe 2nd
    }
    
    static {
        System.out.println("Shivi");      //this is static block      this will exe 1st
    }

    {
        System.out.println("Morning");    //exe 3rd
    }

    int demo(int n) {
        return n*n;
     } 

    public static void main(String[] args) {

        Non_Static_Block ns = new Non_Static_Block();
        int res = ns.demo(20);
        System.out.println(res);
        
    }
}
