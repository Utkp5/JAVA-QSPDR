package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE FACTORIAL OF A NUMBER 


public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int i = 1, sum = 0;

        while (num > i) { 
            
            if (num%i==0) {

                sum = sum + i;
            }
            i++;

        }
        
        if (sum==num) {
            System.out.print("POSIIVE NUMBER");
        } else {
            System.out.print("NOT A POSIIVE NUMBER");
        }


        sc.close();    

    }
}
