import java.util.Scanner;

public class Char_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HERE : ");
        char val = sc.next().charAt(0);
        
        String res = (val > 'a' && val < 'z') ? "non Number" :  ((val > 'A' && val < 'Z') ? "Non Number" : "Number")  ;
        System.out.println(res);

        sc.close();
    }
    
}
