package if_else_Ques;

import java.util.Scanner;

public class Range_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : "); 
        int num = sc.nextInt();

        if (num==0) {
            System.out.println("NUMBER IS EQUAL TO 0");
        }
        else if (num < 0) {
             System.out.println("NUMBER IS LESS THAN 0");
        }
        else if (num > 0 && num <= 100 ) {
             System.out.println("NUMBER IS BETWEEN 0 TO 100");
        }
        else if (num > 100 && num <= 200) {
             System.out.println("NUMBER IS BETWEEN 100 TO 200");
        }
        else  {
             System.out.println("NUMBER IS ABOVE 200");
        }
        

        sc.close();
    }    
}
