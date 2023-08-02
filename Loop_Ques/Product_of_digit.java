package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE PRODUCT OF DIGIT OF A  NUMBERS 
//like eg(12345 : - 1*2*3*4*5=120)


public class Product_of_digit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int prod = 1,last_digit = 0;
            
            while (num > 0) {
              last_digit = num % 10;
              prod = prod * last_digit;
              num = num / 10;
            }

            System.out.print("PRODUCT OF DIGIT IS : " + prod); 


            sc.close();
    }    
}
