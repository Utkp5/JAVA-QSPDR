package Test;
import java.util.Scanner;

// WAJP TO CHECK WHETHER THE NUMBER IS BUZZ NUMBER OR FIZZ NUMBER OR NEITHER THE BOTH 
// THE NUMBER THAT ENDS WITH 7 OR IS DIVISIBLE 7 IS KNOWN AS BUZZ NUMBER
// THE NUMBER THAT ENDS WITH 7 AND DIVISIBLE BY 7 IS KNOWN AS FIZZ NUMBER


//       TEST CASE 1: 42 BUZZ NUMBER (DIVISIBLE BY 7)
//                 2: 107 BUZZ NUMBER (ENDS WITH 7 ) 
//                 3. 147 FIZZ NUMBER (ENDS WITH 7 AND ALSO DIVISIBLE BY 7)
//                 4. 134 NEITHER BUZZ NOR FIZZ



public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();
        
        int last_digit = 0, divisble = 0;

        last_digit = num % 10;
        divisble = num % 7;

        if (last_digit==7 && divisble==0) {
            System.out.println("=======FIZZ NUMBER========");
        } 
        else if(last_digit==7 || divisble==0)
        {            
            System.out.println("=======BUZZ NUMBER========");
        }
        else {            
            System.out.println("=======NEITHER BUZZ NOR FIZZ NUMBER========");
        }
        
        sc.close();
    }
}
