package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE NUMBER OF DIGIT DIVISIBLE BY 3 
//like eg(46731 : - 6,3 = 2)


public class Number_of_digit_divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int count = 0,last_digit = 0;

            while (num > 0) {
                last_digit = num % 10;
                num = num / 10;

                if ((last_digit%3==0)) {
                    count++;
                } 

            }            

            System.out.print("NUMBER OF DIGIT DIVISIBLE BY 3 IS: " + count);

            sc.close();

    }
}
