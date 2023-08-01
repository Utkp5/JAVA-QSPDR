package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND PRODUCT OF FIRST 5 DIGITS

public class Product_of_5_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1,prod=1;

        while (i<=5) {
            prod = prod*i;
            i++;
        }       

        System.out.println("PRODUCT OF FIRST 5 DIGITS : " + prod);

        sc.close();

    }
}
