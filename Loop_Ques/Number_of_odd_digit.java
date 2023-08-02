package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE NUMBER OF ODD DIGIT IN A NUMBER
//like eg(46731 : - 7,3,1 = 3)


public class Number_of_odd_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
            int num = sc.nextInt();

            int count = 0,last_digit = 0;

            while (num > 0) {
                last_digit = num % 10;
                num = num / 10;

                if (!(last_digit%2==0)) {
                    count++;
                } 

            }

            

            

            System.out.print("ODD DIGIT IN A NUMBER  : " + count); 


            sc.close();

    }
}
