package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE SUM OF ODD NUMBER B/W 5 AND 10

public class Sum_of_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 5,sum=0;

        while (i<=10) {

            if (i%2!=0) {
                sum = sum+i;                
            }
            i++;
        }

        System.out.println("SUM OF ODD NUMBER B/W 5 AND 10 : " + sum);

        sc.close();
    }    
}
