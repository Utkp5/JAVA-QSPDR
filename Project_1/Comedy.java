package Project_1;

class Comedy extends BookMyShow{

    double price = 0, tax;
    int Comedychoice;


    @Override
    public void search()
    {
        System.out.println("Enter the Comedy show you want to watch");
        System.out.println("press 1 for Standup / 2 for Show");
        Comedychoice = sc.nextInt();

        if (Comedychoice == 1) {

            System.out.println("Enter the show you want to watch");
            System.out.println("Munawar / Harsh ");
            String showSelect = sc.next();
            System.out.println("Enjoy watching the " + showSelect + " Comedy Standup show");
            
        } else {

            System.out.println("Enter the show you want to watch");
            System.out.println("Zakir / Bassi ");
            String showSelect = sc.next();
            System.out.println("Enjoy watching the " + showSelect + " show");
            
        }
    }
    
    
    public void seatSelection()
    {        
        if (Comedychoice == 1) {
            
            System.out.println("Enter the Number of seats u want to book");
            int seatBook = sc.nextInt();
            System.out.println("Price for 1 seat is Rs.500");
            price = tax + price + (500 * seatBook);
            System.out.println("Sub Total is Rs." + price);
            tax = ((price * 5) / 100) ;  // calculating tax
            System.out.println("Tax 5% on seat is Rs." + tax);
            price = price + tax;
            System.out.println("Total amount to pay is Rs." + price);

        }
        if (Comedychoice == 2) {

            System.out.println("1 --> Price for Nearstage seat is Rs.5000");
            System.out.println("2 --> Price for Middle    seat is Rs.3000");
            System.out.println("3 --> Price for Back      seat is Rs.1500");
            int Chooseseat = sc.nextInt();

            System.out.println("Enter the Number of seats u want to book");
            int seatBook = sc.nextInt();

            if (Chooseseat == 1) {
                
                price = price + (5000 * seatBook);
                System.out.println("Sub Total is Rs." + price);
                tax = ((price * 15) / 100 );  // calculating tax
                System.out.println("Tax 15% on seat is Rs." + tax);
                price = price + tax;
                System.out.println("Total amount to pay is Rs." + price);
            }
            if (Chooseseat == 2) {
                
                price = price + (3000 * seatBook);
                System.out.println("Sub Total is Rs." + price);
                tax = ((price * 10) / 100 );  // calculating tax
                System.out.println("Tax 10% on seat is Rs." + tax);                
                price = price + tax;
                System.out.println("Total amount to pay is Rs." + price);
            }
            if (Chooseseat == 3) {
                
                price = price + (1500 * seatBook);
                System.out.println("Sub Total is Rs." + price);
                tax = ((price * 5) / 100 );  // calculating tax
                System.out.println("Tax 5% on seat is Rs." + tax);
                price = price + tax;
                System.out.println("Total amount to pay is Rs." + price);
            }            
        }
            

    }


    public void addOns()
    {
        System.out.println("Do u want any addOns?  1 for Yes / 2 for No");
        int addon = sc.nextInt();

        if (addon == 2) {
            System.out.println("Total amount to pay is Rs." + price);

        } else {
            System.out.println("Enter the addons");
            System.out.println("1 for Popcorns");
            System.out.println("2 for Drinks");
            int choice = sc.nextInt();
            
            if (choice == 1) {

                System.out.println("Choose your Popcorns");
                System.out.println("1 for Small Rs. 150");                
                System.out.println("2 for Large Rs. 300");
                int addonchoice = sc.nextInt();
                System.out.println("Enter the number of addons ");
                int noofaddons = sc.nextInt();

                if (addonchoice == 1) {
                    System.out.println("You selected Small!");
                    price = price + (150 * noofaddons);
                    System.out.println("Total price is : " + price);
                    
                }
                else  {
                    System.out.println("You selected Large!");
                    price = price + (300 * noofaddons);
                    System.out.println("Total price is : " + price);
                }
            }
            if (choice == 2) {

                System.out.println("Choose your Drinks");
                System.out.println("1 for Coke Rs. 200");                
                System.out.println("2 for Beer Rs. 350");
                int addonchoice = sc.nextInt();
                System.out.println("Enter the number of addons ");
                int noofaddons = sc.nextInt();

                if (addonchoice == 1) {
                    System.out.println("You selected Coke!");
                    price = price + (200 * noofaddons);
                    System.out.println("Total price is : " + price);

                }
                else  {
                    System.out.println("You selected Beer!");
                    price = price + (350 * noofaddons);
                    System.out.println("Total price is : " + price);
                }
            }
        }
    }

    public void bookTicket()
    {
        search();
        seatSelection();
        addOns();
    }

    public void cancelTicket()
    {
        // System.out.println("Do u want to cancel your ticket ?  No / Yes ");
        String cancelChoice = "yes";

        if (cancelChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Ticket has been cancelled");
            double cancelTicketCharges = ((price * 10) / 100);  // calculating cancel charges
            double cancel = price - cancelTicketCharges;  
            System.out.println("10% charge on Cancellation of tickets is Rs." + cancelTicketCharges);
            System.out.println("Total amount to be refunded Rs. " + cancel);
        } else {
            System.out.println("Enjoy the show ");
        }
    }


}