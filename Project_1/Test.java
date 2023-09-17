package Project_1;
import java.util.Scanner;

public class Test {

    static {
        System.out.println("==========Welcome to Utkarsh BookMyShow=============");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookMyShow Bms = new BookMyShow();
        Bms.signup();

        if (Bms.isLogin == true) {

            Bms.search();

            if (Bms.selection == 1) {
                
                Movie m = new Movie();
                m.bookTicket();
                System.out.println("Do you want to cancel ? Yes / No");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("Yes")) {
                    m.cancelTicket();
                } else {
                    System.out.println("Enjoy the show....Thank U for Booking...... ");                    
                }

            }

        } 
        
        if (Bms.selection == 2) {
            System.out.println("Comdey show");                    
        }


        sc.close();
    }
}
