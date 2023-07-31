package if_else_Ques;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER LENGTH : "); 
        int num1 = sc.nextInt();
        System.out.print("ENTER BREDTH : ");
        int num2 = sc.nextInt();


        if (num1==num2)  {
            System.out.println("SQUARE");
        }                
        else  { 
             System.out.println("RECTANGLE");
        }

        sc.close();

    }
}
