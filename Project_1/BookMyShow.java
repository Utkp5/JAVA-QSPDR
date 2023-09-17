package Project_1;
import java.util.Scanner;

public class BookMyShow {

    Scanner sc = new Scanner(System.in);
    String emailid, pwd;
    boolean isLogin;
    int selection;

    public void signup()
    {
        System.out.println("Do you have an account ?  1 --> No , 2 --> yes");
        int n = sc.nextInt();

        if (n==1) {
            System.out.println("Enter the emailid : ");
            emailid = sc.next();
            System.out.println("Enter the password : ");
            pwd = sc.next();
            login();
        } else {
            System.out.println("Login to your account");
            login();
        }
    }
    
    public void login()
    {
        System.out.println("Enter Login deatils");
        System.out.println("Enter the email id : ");
        String loginemail = sc.nextLine();
        System.out.println("Enter the password : ");
        String loginpwd = sc.nextLine();

        if (loginemail.equalsIgnoreCase(emailid) && loginpwd.equalsIgnoreCase(pwd)) {
            System.out.println("Login successfully");
            isLogin = true;
        } else {
            System.out.println("Invalid credentials");
            isLogin = false;
            login();
        }
    }

    public void search()
    {
        System.out.println("Enter your choice");
        System.out.println("1 for Movies / 2 for Comedy / 3 for Live events");
        selection = sc.nextInt();
    }

    public void bookTicket()
    {
        System.out.println("Ticket is being booked");
    }

    public void cancelTicket()
    {
        System.out.println("Ticket is being Cancelled");
    }


    
}