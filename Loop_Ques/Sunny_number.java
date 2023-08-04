package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND WHETHER THE NUMBER IS SUNNY OR NOT 
//(a no which is proper divisible except the no. is the no. itself)
//(like :-  6 => 1,2,3 = 1+2+3 = 6 so is a perf no.)
//(like :-  8 => 1,2,4, = 1+2+4 = 7 so is not a perf no.)



public class Sunny_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int i = 1, square = 0;

        num = num + 1;
        
        while (num >i) {             
            
            square = i * i;            
            i++;

            if(square == num) {
                System.out.println("==================");
                System.out.println("NUMBER + 1 : " + num);                
                System.out.println("ITS A SUNNY NUMBER ");
                System.out.println("==================");
                i = num;   
            }            
        }
        if (square != num) {
            System.out.println("==================");
            System.out.println("NUMBER + 1 : " + num);
            System.out.println("ITS NOT A SUNNY NUMBER ");
            System.out.println("==================");
        }

        sc.close();    
    }
}
