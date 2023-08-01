package Random;
import java.util.Scanner;
public class Positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER HERE : ");
        int val = sc.nextInt();

        String res = ((val == 0 )? "You enter 0 value" : (val > 0)? "Positive Number" : "Negative Number");

        System.out.println(res);

        sc.close();
    }
}
