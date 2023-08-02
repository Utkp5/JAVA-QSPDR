package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE PRODUCT OF SUM OF ODD AND EVEN DIGIT IN A NUMBER
//like eg(46731 : - 46(4+6) = 10... 731(7+3+1) = 11...  10*11 = 110  )

public class Product_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int last_digit = 0, even = 0, odd = 0, result = 0;
            
            while (num > 0) {
              last_digit = num % 10;
              num = num / 10;

              if ((last_digit%2==0)) {
                    even = even + last_digit;   
                }
                else {
                    odd = odd + last_digit;   
                }

            }

            result = even * odd;

            System.out.print("PRODUCT OF EVEN & ODD DIGIT IS : " + result); 


            sc.close();

    }
}
