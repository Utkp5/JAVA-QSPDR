package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE AVERAGE OF DIGIT OF A  NUMBERS 
//like eg(2763 : - 2+7+6+3=18...  18/4 = 4 )

public class Avg_of_digits {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int  last_digit = 0, avg = 0, sum = 0 , count = 0;
            
            while (num > 0) {
                count++;                
                last_digit = num % 10;
                sum = sum + last_digit;
                num = num / 10;
            }

            avg = sum / count;

            System.out.print("AVERAGE OF DIGIT IS : " + avg); 


            sc.close();
    }
}
