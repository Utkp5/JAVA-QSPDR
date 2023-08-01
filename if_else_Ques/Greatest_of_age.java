package if_else_Ques;

import java.util.Scanner;

public class Greatest_of_age {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

       System.out.print("ENTER FIRST AGE : "); 
       int age1 = sc.nextInt();
       System.out.print("ENTER SECOND AGE : ");
       int age2 = sc.nextInt();
       System.out.print("ENTER THIRD AGE : ");
       int age3 = sc.nextInt();

       if (age1 > 0 && age2 > 0 && age3 > 0) {
        
           if (age1 > age2 && age1 > age3 && age3 > age2) {
              System.out.println(age1 +" "+ "IS ELDEST" +" "+ age2 +" "+ "IS YOUNGEST");
            } 
            else if (age2 > age3 && age2 > age1 && age1 > age3) {
               System.out.println(age2 +" "+ "IS ELDEST" +" "+ age3 +" "+ "IS YOUNGEST");
            } 
            else {
               System.out.println(age3 +" "+ "IS ELDEST" +" "+ age1 +" "+ "IS YOUNGEST");
            } 

       } else {
         System.out.println("Invalid input");
       }

        sc.close();
   
    }   

}
