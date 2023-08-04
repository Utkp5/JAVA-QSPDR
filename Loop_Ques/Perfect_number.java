package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE PERFECT NUMBER  OR NOT
//(a no which is proper divisible except the no. is the no. itself)
//(like :-  6 => 1,2,3 = 1+2+3 = 6 so is a perf no.)
//(like :-  8 => 1,2,4, = 1+2+4 = 7 so is not a perf no.)

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
