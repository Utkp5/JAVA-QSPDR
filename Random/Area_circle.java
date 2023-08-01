package Random;
import java.util.Scanner;
public class Area_circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER RADIUS: "); 
        double radius = sc.nextDouble();
        double result = (3.14 * radius * radius);
        System.out.println("AREA OF CIRCLE IS: " + result);
        sc.close();
    }
    
}
