package Function_Ques;
import java.util.Scanner;


public class Multiplication {

    public static void mul(int num)
    {
        for (int i = 1; i <=10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);  
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        mul(num);

        sc.close();
    }
}
