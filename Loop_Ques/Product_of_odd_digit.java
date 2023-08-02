package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE PRODUCT OF ODD DIGIT IN A NUMBERS
//like eg(276387 : - 7*3*7 = 147 )

public class Product_of_odd_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int prod = 1, last_digit = 0;
            
            while (num > 0) {
              last_digit = num % 10;
              num = num / 10;

              if (!(last_digit%2==0)) {
                    prod = prod * last_digit;   
                }              
            }

            System.out.print("PRODUCT OF ODD DIGIT IS : " + prod); 


            sc.close();

    }   
}
