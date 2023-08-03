package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND WHETHER THE NUMBER IS PERFECT SQUARE OR NOT 
//like eg(8 :- NO .... 9 :- YES)


public class Perfect_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int i = 1, square = 0;

        while (num >i) {             
            
            square = i * i;            
            i++;

            if(square == num) {
                System.out.println("PERFECT SQUARE");
                i = num;
            }            
        }
        if (square != num) {
            System.out.println("NOT A PERFECT SQUARE");            
        }

        sc.close();    
    }   
}
