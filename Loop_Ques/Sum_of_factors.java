package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE SUM OF FACTTORS OF A NUMBER 
//like eg(6 :- 1,2,3,6  => 1+2+3+6 = 12 )


public class Sum_of_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();       

        int sum = 0;

        for( int i = 1; i <= num; i++) { 
            
            if (num%i==0) {
                sum = sum + i;                
            }           
        }
        System.out.print("THE SUM OF FACTORS OF A " + num + " IS : " + sum);

        sc.close();    
    }
}
