package Function_Ques;
import java.util.Scanner;



public class Prime_num_1_100 {

    static void Find_prime(int num)
    {    
        int count = 0;   
        System.out.println("========PRIME NUMBER FROM 1 TO 100========="); 
        for (int i = 1; i <=num; i++) {

            if (i%i==0)
            {
               count++; 
               for (int j = 2; j <=num/2; j++) {
                    if (i%j == 0) {
                        count++;
                    }
                }
            }        
            if (count <= 2 ) {
                System.out.println(i);                    
            }
            count = 0;
            
        }
        

    }   



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("ENTER A NUMBER : ");  ===No need===
        // int num = sc.nextInt();
        
         Find_prime(100);
        

        sc.close();
    }
}
