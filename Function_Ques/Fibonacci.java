package Function_Ques;
import java.util.Scanner;


public class Fibonacci {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();        

        int first_val = 0; 
        int second_val = 1; 
        int res = 0;
    
        System.out.print(first_val + " " + second_val + " ");

        for (int i = 0; i < num; i++) {
    
             res = first_val + second_val;

             first_val = second_val;
             second_val = res;
             
             System.out.print(res + " ");    
        }
        sc.close();
    }
}
