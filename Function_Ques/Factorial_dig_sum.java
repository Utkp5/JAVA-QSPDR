package Function_Ques;
import java.util.Scanner;



public class Factorial_dig_sum {

    static int Factorial_Digt_Sum(int num)
    {

        int temp = 0, sum = 0, fact = 1;
        while (num > 0) {
            temp = num % 10;
            num = num / 10;       

            for (int i = 1; i <=temp; i++) {
                fact = fact * i;    
            }

            sum = sum + fact;
            fact = 1;
        }
        return sum;
    }   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int result = Factorial_Digt_Sum(num);
        System.out.println("FACTORIAL OF A DIGIT OF A NUMBER IS : " + result);

        sc.close();
    }
}
