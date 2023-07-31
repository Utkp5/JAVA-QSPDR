package if_else_Ques;

import java.util.Scanner;

public class Vowel_consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A CHARACTER : ");
        char val = sc.next().charAt(0);

        if (!(val > 'A' && val < 'Z' || val > 'a' && val < 'z')) {
            
            System.out.println(val +" "+ "SPECIAL CHARACTER");
        } else {
            if (val=='A' || val=='E' || val=='I' || val=='O' || val=='U' || val=='a' || val=='e' || val=='i' || val=='o' || val=='u') {
                System.out.println("VOWEL");                
            } else {
                System.out.println("CONSONENT");                
            }
        }        

        sc.close();
    }    
}
