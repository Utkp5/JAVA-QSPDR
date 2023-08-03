package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE MAX AND MIN DIGIT IN A NUMBER  
//like eg(46731 : -   max = 7 and min = 1)


public class Number_of_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int max = num%10;
        int min = num%10; 

        while (num > 0) {
            int last_digit = num % 10;
            
            if (last_digit > max) {
                max = last_digit;                              
            }
            if (last_digit < min) {
                min = last_digit;
            }

            num = num / 10;

            
            }

        System.out.println("MAXIMUM VALUE IS : " + max + " " + "AND" + " " + "MINIMUM VALUE IS : " + min);

        sc.close();
    }    
}
