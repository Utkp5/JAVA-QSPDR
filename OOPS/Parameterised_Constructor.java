package OOPS;

public class Parameterised_Constructor {

    static String brand = "Hyundai";
    String model;
    int    price;
    double mileage ;

    Parameterised_Constructor(String model, int price, double mileage)
    {
        this.model   = model;
        this.price   = price;
        this.mileage = mileage ;

        System.out.println("Brand : " + brand + "\t" +"||"+
                           "Model : " + model + "\t" +"||"+
                           "Price : " + price + "\t" +"||"+
                           "Mileage : " + mileage);

    }


    public static void main(String[] args) {
        
        new Parameterised_Constructor("Creta", 1000000, 10.5);
        new Parameterised_Constructor("Xuv", 5000000, 11.5);
        new Parameterised_Constructor("Kia", 9000000, 9.5);
        
    }
}
