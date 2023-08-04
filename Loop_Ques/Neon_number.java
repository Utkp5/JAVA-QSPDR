package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND WHETHER THE NUMBER IS NEON OR NOT 
//like eg(user input as 9 => 9ka sq = 81...  8+1 = 9... means 9 is eq to 9 )



public class Neon_number {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("ENER A NUMBER : ");
        int num = sc.nextInt();
        
        int sq = 0, sum = 0, last_digit = 0;
        
        sq = num * num;
        while(sq > 0)
        {
            last_digit = sq % 10;
            sum = sum + last_digit;
            sq = sq / 10;
        }   
        
        if (sum == num) {

            System.out.println("ITS A NEON NUMBER");            
            
        } else {            
            System.out.println("ITS NOT A NEON NUMBER");            
        }    



        sc.close();
    }   
}
