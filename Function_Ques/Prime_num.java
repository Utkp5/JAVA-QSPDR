package Function_Ques;
import java.util.Scanner;


public class Prime_num {

    //    ==============TRADITIONAL METHOD==================

    // static boolean Find_prime(int num)
    // {
    //     int count = 0;

    //     for (int i = 1; i <=num; i++) {

    //         if (num%i==0) {
    //            count++;   
    //         }
    //     }

    //     if (count <= 2) {
    //         return true;
    //     }        
    //     return false;
    // }   
    

    //    ==============ANOTHER METHOD OR LOGIC ==================

    static boolean Find_prime(int num)
    {        
        for (int i = 2; i <=num/2; i++) {

            if (num%2==0) {
                return false;
            }        
            
        }
        return true;

    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();
        
        boolean result = Find_prime(num);

        if (result == true) {
            System.out.print("======PRIME NUMBER========");            
        } else {
            System.out.print("======NOT A PRIME NUMBER========");            
        }

        sc.close();
    }
}
