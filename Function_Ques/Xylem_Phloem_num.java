package Function_Ques;
import java.util.Scanner;



public class Xylem_Phloem_num {

    static boolean Find_Xylem_Phloem(int n)
    {
        int sum  = 0, sum1 = 0, lst_dig = 0, frst_dig = 0, val = 0;

        lst_dig = n % 10;
        n = n / 10;

        while (n > 9) {
            val = n % 10;
            sum1 = sum1 + val;
            n = n / 10;
        }
        frst_dig = n;
        sum = lst_dig + frst_dig;
        
        if (sum == sum1) {
            return true;            
        }
        else {
            return false;            
        }        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        boolean result = Find_Xylem_Phloem(num);

        if (result == true) {
            System.out.println("==============ITS A XYLEM NUMBER===========");
        } else {
            System.out.println("==============ITS A PHLOEM NUMBER==========");            
        }

        sc.close();

    }
}
