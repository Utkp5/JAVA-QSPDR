package Test;
import java.util.Scanner;

// WAP TO CHECK WETHER THE FIRST HALF OF NUMBER IS ODD OR EVEN?

//  TEST CASE 1: 76       ODD
//            2:4881      EVEN
//            3:741852    ODD


public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int temp = num, nofz = 1, count = 0, frst_half = 0;   

        while (num > 0) {
            count++;
            num = num / 10;
        }

        for (int i = 1; i <= count / 2; i++)
        {
            nofz = nofz * 10;
        }

        frst_half = temp / nofz;

        if (frst_half%2==0 ) {
            System.out.println("===============================");
            System.out.println("FIRST HALF OF A NUMBER IS EVEN");
            System.out.println("===============================");
            
        } else 
        {
            System.out.println("===============================");
            System.out.println("FIRST HALF OF A NUMBER IS ODD");            
        }

        sc.close();

    }   
}
