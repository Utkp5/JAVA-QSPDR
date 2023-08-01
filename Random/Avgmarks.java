package Random;
import java.util.Scanner;

public class Avgmarks {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("ENTER YOUR MARKS IN PHYSICS : "); 
       int p = sc.nextInt();
       System.out.println("ENTER YOUR MARKS IN CHEMISTRY : ");
       int c = sc.nextInt();
       System.out.println("ENTER YOUR MARKS IN BIOLOGY: ");
       int b  = sc.nextInt();
       System.out.println("ENTER YOUR MARKS IN MATHS: ");
       int m = sc.nextInt();
       double result = (p+c+b+m); double avgm = result/4;            
       System.out.println("TOTAL MARKS:       "       + result);
       System.out.print("AVERAGE MARKS:      "        + avgm);

       sc.close();

    }
} 