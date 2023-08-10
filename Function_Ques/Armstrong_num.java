package Function_Ques;
import java.util.Scanner;




public class Armstrong_num {

    static boolean Chk_armstrong(int n)
    {
        int temp = n,temp1 = n, sum  = 0, count = 0,val = 0, cube = 1;;
        
        while (n > 0) {
            count++;
            n = n / 10;
        }

        while (temp > 0) {
            val = temp % 10;
            cube = 1;

            for (int i = 1; i <=count ; i++)
            {
                cube = cube * val;
            }
            sum = sum + cube;
            temp = temp / 10;
        }        

        if (sum == temp1) {
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

        boolean result = Chk_armstrong(num);

        if (result == true) {
            System.out.println("==============ITS A ARMSTRONG NUMBER===========");
        } else {
            System.out.println("==============ITS NOT A ARMSTRONG NUMBER==========");            
        }

        sc.close();

    }
}
