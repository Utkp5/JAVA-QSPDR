package Function_Ques;
import java.util.Scanner;


public class Palindrome_num {

    static boolean Palindrome(int n) {

        int rem = 0, rev = 0, temp = n;

        while (n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        };
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        boolean result = Palindrome(num);

        if (result == true) {
            System.out.println("NUMBER IS PALINDROME");            
        } else {
            System.out.println("NUMBER IS NOT A PALINDROME");            
        }

        sc.close();
    }
}
