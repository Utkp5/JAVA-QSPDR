package Loop_Ques;
import java.util.Scanner;

// Question :-  WAP TO FIND THE SUM OF DIGIT OF A NUMBER
//like eg(8976 : - 8+9+7+6=30)

public class Sum_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : "); 
        int num = sc.nextInt();
        
        int temp = num,sum = 0,tempval = 0;

        while (temp > 0) {
            tempval = temp%10;
            sum = sum+tempval;
            temp = temp/10;            
        }
        System.out.print("SUM OF " + num + " IS : " + sum); 

        sc.close();
    }
}
