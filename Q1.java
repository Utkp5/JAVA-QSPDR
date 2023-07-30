import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER HERE : ");
        char val = sc.next().charAt(0);

        String res = (val > 'a' && val < 'z') ? "Lower case and char" : ((val > 'A' && val < 'Z') ? "Upper case and char" : (val > 48 && val <= 57) ? "Number" : "Symbol");

        System.out.println(res);

        sc.close();
    }
}
