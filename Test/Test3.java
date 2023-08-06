package Test;
import java.util.Scanner;


// WAP TO FIND *MEAN* OF A NUMBER?
// (SMALLEST DIGIT + LARGEST DIGIT) DIVIDE BY NUMBER OF DIGITS

//       TEST CASE 1: 7531 SMALLEST IS 1, GREATEST 7, SO 7 + 1 = 8 NUMBER OF DIGIT IS 4... 8/4 = 2 
//                 2: 842314 SMALLEST 1, GREATEST 8...  8 + 1 = 9...   9/6 = 1.5  



public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int count = 0, temp = num, last_digit = 0;

        int small = num % 10;
        int lrge = num % 10;
        

        while (num > 0) {
            count++;
            num = num / 10;
        }

        while (temp > 0) {
            last_digit = temp % 10;

            if (last_digit > lrge)
            {
                lrge = last_digit;
            } 
            else if (last_digit < small) {
                small = last_digit;
            } 

            temp = temp / 10;
        }

        double res = (small + lrge) / count;
        
        System.out.println("========SMALLEST NUMBER  IS : " + small );
        System.out.println("========LARGEST NUMBER  IS : " + lrge );
        System.out.println("========NUMBER OF DIGIT IS : " + count );
        System.out.println("========OUTPUT IS : " + res + " ============");

        sc.close();
    }        
}
