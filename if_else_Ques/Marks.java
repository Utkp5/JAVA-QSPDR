package if_else_Ques;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("ENTER YOUR MARKS IN PHYSICS : "); 
       int p = sc.nextInt();
       System.out.println("ENTER YOUR MARKS IN CHEMISTRY : ");
       int c = sc.nextInt();
       System.out.println("ENTER YOUR MARKS IN BIOLOGY: ");
       int b  = sc.nextInt();
       System.out.println("ENTER YOUR MARKS IN MATHS: ");
       int m = sc.nextInt();
       

       if (p > 0 && p < 100 && c > 0 && c < 100 && b > 0 && b < 100 && m > 0 && m < 100 ) {

       
            double sum = (p+b+c+m);
            double per = (sum/400)*100;
            System.out.println(per);

            if (p<40 || c<40 || b<40 || m < 40) {
                System.out.println("YOU ARE FAIL IN SOME!");
            }
            else if (per > 40 && per <=50) {
                 System.out.println("YOUR GRADE IS C+ ");
            }
            else if (per >= 60 && per <=70) {
                 System.out.println("YOUR GRADE IS B+ ");
            }
            else if (per >= 80 && per <90) {
                 System.out.println("YOUR GRADE IS A ");
            }
            else if ( per >= 90) {
                 System.out.println("YOUR GRADE IS A+ ");
            }
            else {
                System.out.println("YOU ARE FAIL!");
            }

       } else {
          System.out.println("WRONG INPUT");
       }



        sc.close();
    }   
}
