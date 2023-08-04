package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND WHETHER THE NUMBER IS AUTOMORPHIC OR NOT
//like eg(if the sqr of a num is end with the same no is called automorphic);
//(like :- 7 => 7*7 = 49 not a automph....  
// 6 => 6*6 = 36 so it is automorphs bcz in 36.. 6 is the same as num as a user input  )


public class Automorphic_num {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int temp = num, last_digit = 0, square = 0, count = 0, nofzero = 1;


        while (num > 0) {
            count++;
            num = num / 10;
        }
        
        for (int i = 1; i <= count; i++) {
            nofzero = nofzero * 10;
        }    
            
            square = temp * temp;
            last_digit =  square % nofzero;           
            
        if (last_digit == temp) {

            System.out.println("NUMBER IS : " + temp);
            System.out.println("SQUARE IS : " + square);
            System.out.println("ITS A AUTOMORPHIC NUMBER");
            
        } else {
            System.out.println("NUMBER IS : " + temp);
            System.out.println("SQUARE IS : " + square);
            System.out.println("ITS NOT A AUTOMORPHIC NUMBER");
            
        }

        sc.close();    
     }      
}
