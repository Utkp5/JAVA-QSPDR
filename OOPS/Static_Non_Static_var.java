package OOPS;

// *STATIC* VARIABLE AND *NON-STATIC* VARIABLE

public class Static_Non_Static_var {
    
    static String brand = "Iphone";
    String model;
    int price, no_of_camera;

    static{
        System.out.println("Static block!");
    }

    {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
        System.out.println(no_of_camera);
    }

    public static void main(String[] args) {
        System.out.println("====MMS===");
        Static_Non_Static_var  v1 = new Static_Non_Static_var();

    }
}
