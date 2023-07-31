package if_else_Ques;

 // Q WAP to take a no from user and check whether the no is odd even

import java.util.Scanner;

public class Odd_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER : ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("EVEN NUMBER");            
        }
        else
        {
            System.out.println("ODD NUMBER");
        }
        
        sc.close();

    }
    
}