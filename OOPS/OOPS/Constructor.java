package OOPS;

public class Constructor {

    {
        System.out.println("IPHONE 13");
    }
    
    static {
        System.out.println("IPHONE 14");       //this will call only once  
    }

    Constructor()
    {
        System.out.println("IPHONE 14 PRO");
    }
    
    public static void main(String[] args) {
        // Constructor c1 = new Constructor();  giving a warning at c1 (if c1 has no use then we can write like this) 
        new Constructor();
        new Constructor();
    }

    {
        System.out.println("IPAD");
    }

}