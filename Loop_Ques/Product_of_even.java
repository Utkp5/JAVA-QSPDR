package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE PRODUCT OF EVEN NUMBERS FROM 1 AND 10

public class Product_of_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1,prod = 1;

        while (i<=10) {

            if (i%2==0) {
                prod = prod*i;                
            }
            i++;
        }

        System.out.println("PRODUCT OF EVEN NUMBERS FROM 1 AND 10 : " + prod);

        sc.close();
    }

}
