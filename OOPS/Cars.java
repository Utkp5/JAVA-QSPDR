package OOPS;

public class Cars {

    static String brand = "Hyundai";
    String name;
    int price;

    static {
        System.out.println("Welcome to Hyundai Showroom");
    }

    {
        System.out.println("this is " + name + " car");
    }

    Cars() {
        System.out.println(" Please pay the bill ");
        name = "verna";
        price = 1800000;
        System.out.println("visit again");

    }

    public static void main(String[] args) {
        
        System.out.println("main method starst");
        Cars cl = new Cars();
        Cars c2 = new Cars();
        System.out.println(Cars.brand +"\t" + cl.price + "\t" + cl.name);
        System.out.println(Cars.brand + "\t" + c2.price + "\t" + c2.name);
        System.out.println("main meth ends");
    }
}
