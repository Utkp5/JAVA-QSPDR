package if_else_Ques;

import java.util.Scanner;

public class Divisible_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : "); 
        int num = sc.nextInt();

        if (num%3==0 && num%2==0) {
            System.out.println("Rahat and shivi");
        }
        else if (num%3==0) {
             System.out.println("shivi");
        }
        else if (num%2==0) {
             System.out.println("Rahat");
        }        
        else  {
             System.out.println("Devdas");
        }


        sc.close();

    }        
}
