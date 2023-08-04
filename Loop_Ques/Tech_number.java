package Loop_Ques;

import java.util.Scanner;

public class Tech_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int temp = num, sum = 0, square = 0, count = 0, nofzero = 1;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        if (count%2==0) {
            
            for (int i = 1; i <= count/2 ; i++) {

                nofzero = nofzero * 10;
            }

            int first_half = temp % nofzero;
            int sec_half = temp / nofzero;

            sum = first_half + sec_half;
            square = sum * sum;

            if (square == temp) {
                
                System.out.println("=================================");
                System.out.println("SUM OF A NUMBER IS : " + sum);
                System.out.println("SQUARE OF A NUMBER IS : " + square);
                System.out.println("ITS A TECH NUMBER");
                System.out.println("=================================");
                
            } else {

                System.out.println("SUM OF A NUMBER IS : " + sum);
                System.out.println("SQUARE OF A NUMBER IS : " + square);
                System.out.println("=================================");
                System.out.println("ITS NOT A TECH NUMBER");                
            }
            


        } else {

            System.out.println("ITS NOT A EVEN NUMBER");
            
        }        
        

        sc.close();    
    }
}
