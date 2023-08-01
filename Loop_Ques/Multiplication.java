package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO PRINT THE TABLE OF A NUMBER

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();

        int i = 1;
        while (i<=10) {

            System.out.println(num + " * " + i + " = " + (num*i));
            i++;
        }

        sc.close();

    }
}
