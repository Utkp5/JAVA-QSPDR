package Function_Ques;
import java.util.Scanner;



public class Factorial {

    static int Find_Factorial(int num)
    {
        int fact = 1;

        for (int i = 1; i <=num; i++) {
            fact = fact * i;    
        }
        return fact;
    }    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int result = Find_Factorial(num);
        System.out.println("FACTORIAL OF A NUMBER IS : " + result);

        sc.close();
    }

}
