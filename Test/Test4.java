package Test;

import java.util.Scanner;

// WAP TO PRINT WHETER THE NUMBER IS STRONG IN OR NOT?
// IF SUM OF FACTORIAL OF NUMBER IS SAMEE AS THAT OF NUMBER IT IS CALLED STRONG NUMBER
//            TEST CASE 1: 145 == 1! + 4! + 5! === 145 (SO IT IS A STRONG NUMBER........)
//                      2: 40585 == 4! + 0! + 5! + 8! + 5! === 40585 (STRONG NUMBER........)
//                      3: 345 === NOT A STRONG NUMBER.......

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();

        int fact = 1, temp = num, last_digit = 0, sum = 0;


        while (num > 0) {
            
            last_digit = num % 10;
            
            for (int i = 1; i <= last_digit; i++)
            {
                fact = fact * i;
            }
            
            num = num / 10;

            sum = sum + fact;

            fact = 1;

        }

        if (sum == temp) 
        {
            System.out.println("============ITS A STRONG NUMBER==========");
        } else 
        {
            System.out.println("===========ITS NOT A STRONG NUMBER=========");            
        }





        sc.close();
    }        
}
