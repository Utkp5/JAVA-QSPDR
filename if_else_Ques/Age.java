package if_else_Ques;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR AGE : "); 
        int age = sc.nextInt();

        if (age > 0 && age <=100) {

            if (age > 20){
               System.out.println("YOU CAN DRIVE BIKE, SCOOTY, CAR");
            }
            else if (age >= 18 && age <= 21) {
                System.out.println("YOU CAN DRIVE BIKE, CAR");
            }
            else if (age > 14 && age < 21) {
                System.out.println("YOU CAN DRIVE SCOOTY");                
            }            

        }        
        else  {
             System.out.println("INVALID AGE");
        }

        sc.close();

    }
}
