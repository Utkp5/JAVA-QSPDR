package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE FACTORIAL OF A NUMBER 

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();

        int i = 1, fact = 1;

        while (num >=i) {
            fact = fact*i;
            i++;
        }       

        System.out.println("FACTORIAL OF " + num + " IS : " + fact);

        sc.close();       

    }
}
