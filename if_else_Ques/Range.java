package if_else_Ques;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR AGE : ");
        int age = sc.nextInt();
        System.out.print("ENTER YOUR GENDER : ");
        char gen = sc.next().charAt(0);
        System.out.print("ENTER YOUR MARITAL STATUS : ");
        char ms = sc.next().charAt(0);

        if (gen=='F' || gen=='f' && ms=='Y' || ms=='y') {
            System.out.println("URBAN AREAS");
        }
        else if (gen=='F' || gen=='f' && ms=='N' || ms=='n')
        {
            System.out.println("WORK ANYWHERE");            
        }
        else if (gen=='M' || gen=='m' && age >= 20 && age <= 40)
        {
            System.out.println("WORK ANYWHERE");            
        }
        else if (gen=='M' || gen=='m' && age >= 40 && age <= 60)
        {
            System.out.println("URBAN AREAS");            
        }
        else 
        {
            System.out.println("NOT ELIGIBLE TO WORK!");            
        }

        sc.close();

    }
}
