package Function_Ques;
import java.util.Scanner;



public class Reverse_num {

    static int reverse(int n) {

        int rem = 0, rev = 0;

        while (n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int result = reverse(num);
        System.out.println("REVERSE OF A NUMBER : " + result);

        sc.close();
    }
}
