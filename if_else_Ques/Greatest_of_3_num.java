package if_else_Ques;

import java.util.Scanner;

public class Greatest_of_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("ENTER FIRST NUMBER : "); 
       int num1 = sc.nextInt();
       System.out.print("ENTER SECOND NUMBER : ");
       int num2 = sc.nextInt();
       System.out.print("ENTER THIRD NUMBER : ");
       int num3 = sc.nextInt();

       if (num1 > num2 && num1 > num3) {
            System.out.println(num1 +" "+ "IS GREATER");
        } 
        else if (num2 > num3) {
           System.out.println(num2 +" "+ "IS GREATER");
        } 
        else {
           System.out.println(num3 +" "+ "IS GREATER");
       } 

        sc.close();


    }
}
