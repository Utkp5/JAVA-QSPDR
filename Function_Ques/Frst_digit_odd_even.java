package Function_Ques;
import java.util.Scanner;


public class Frst_digit_odd_even {

    static int  Find_digit_odd_even(int num)
    {
        int n = 0; 

        while (num > 9) {
            num = num / 10;
        }
        n = num % 10;
        
        return n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int result = Find_digit_odd_even(num);

        if (result%2==0) {
            System.out.println(result + " NUMBER IS EVEN");            
        }
        else {
            System.out.println(result + " NUMBER IS ODD");            
            
        }


        sc.close();
    }
}
