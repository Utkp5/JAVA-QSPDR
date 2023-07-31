package if_else_Ques;

import java.util.Scanner;

public class Same_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.print("ENTER FIRST NUMBER : "); 
       int num1 = sc.nextInt();
       System.out.print("ENTER SECOND NUMBER : ");
       int num2 = sc.nextInt();

       if (num1==num2) {
           System.out.println("BOTH NUMBERS ARE SAME");        
        } else {
           System.out.println("NUMBERS ARE NOT SAME");       
       }

       sc.close();
    }
}
