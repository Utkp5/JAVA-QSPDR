package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE SUM OF A SQUARE OF A DIGIT OF A NUMBER 
//like eg(1386 :- 1sq = 1, 3sq = 9, 8sq = 64, 6sq = 36 ....... 1+9+64+36 = 110)


public class Sum_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int sum = 0, last_digit = 0, square = 0;

        while (num > 0) { 
            
            last_digit = num % 10;
            square = last_digit * last_digit;
            sum = sum + square;
            num = num / 10;
        }


        System.out.println("SUM OF SQUARE OF DIGIT OF A NUMBER  IS : " + sum);

        sc.close();    
    }   
}
