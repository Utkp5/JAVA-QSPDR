package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE SUM OF EVEN DIGIT IN A  NUMBERS 
//like eg(276387 : - 2+6+8 = 16 )

public class Sum_of_even_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int last_digit = 0,sum = 0;
            
            while (num > 0) {
              last_digit = num % 10;
              num = num / 10;

              if (last_digit%2==0) {
                    sum = sum + last_digit;   
                }              
            }

            System.out.print("SUM OF EVEN DIGIT IS : " + sum); 


            sc.close();
    }
}
