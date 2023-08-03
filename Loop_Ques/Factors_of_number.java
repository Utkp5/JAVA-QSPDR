package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE FACTTORS OF A NUMBER 
//like eg(6 :- 1,2,3,6)


public class Factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int i = 1;

        while (num >= i) { //do it with for loop suggestion
            
            if (num%i==0) {
                System.out.print(i + " ");
            }
            i++;
        }

        sc.close();    
    }
}
