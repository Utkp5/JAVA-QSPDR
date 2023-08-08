package Function_Ques;
import java.util.Scanner;



public class Arithmetic_operation {

    static int sum(int num1, int num2)
    {        
        return num1 + num2;
    }   
    static int diff(int num1, int num2)
    {        
        return num1 - num2;
    }   
    static int prod(int num1, int num2)
    {        
        return num1 * num2;
    }   
    static int mod(int num1, int num2)
    {        
        return num1 % num2;
    }   
    static int div(int num1, int num2)
    {        
        return num1 / num2;
    }   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENTER 1st NUMBER : ");
        int num1 = sc.nextInt();
        
        System.out.print("ENTER 2nd NUMBER : ");
        int num2 = sc.nextInt();

        System.out.println("SUM OF A NUMBER IS        : " + sum(num1,num2));
        System.out.println("DIFFERENCE OF A NUMBER IS : " + diff(num1,num2));
        System.out.println("PRODUCTT OF A NUMBER IS   : " + prod(num1,num2));
        System.out.println("MODULUS OF A NUMBER IS    : " + mod(num1,num2));
        System.out.println("DIVIDE OF A NUMBER IS     : " + div(num1,num2));

        sc.close();
    }
}
