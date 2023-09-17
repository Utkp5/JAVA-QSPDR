package Project_1;


public class Movie extends BookMyShow {

    int price = 0;

    @Override
    public void search()
    {
        System.out.println("Enter the language you want to watch movie");
        System.out.println("press 1 for Hindi / 2 for English");
        int choice = sc.nextInt();

        if (choice == 1) {
            
            System.out.println("Enter the movie to watch in Hindi");
            System.out.println("Jawan  /  Gadar  /  KGF");
            String movieSelect = sc.next();
            System.out.println("Enjoy watching the movie " + movieSelect);
            
        } else {

            System.out.println("Enter the movie to watch in English");
            System.out.println("Barbie  /  Spiderman  /  Avengers");
            String movieSelect = sc.next();
            System.out.println("Enjoy watching the movie " + movieSelect);
            
        }
    }
    

    public void seatSelection()
    {
        System.out.println("Enter the Number of seats u want to book");
        int Numberofseat = sc.nextInt();
        System.out.println("1 for normal Rs.200");
        System.out.println("2 for premium Rs.400");
        System.out.println("3 for executive Rs.600");
        int selectedseat = sc.nextInt();

        if (selectedseat == 1) {
            
            price = price + (200 * Numberofseat);

        } 
        if (selectedseat == 2) {
            
            price = price + (400 * Numberofseat);

        } 
        if (selectedseat == 3) {
            
            price = price + (600 * Numberofseat);

        } 
        System.out.println("Total Amount for the movie is : Rs. " + price);
    }


    public void addons()
    {
        System.out.println("Do u want any addOns?  1 for No / 2 for Yes ");
        int addon = sc.nextInt();

        if (addon == 1) {
            
            System.out.println("Total price is : "+price);
            
        } else {
            System.out.println("Enter the addons");
            System.out.println("1 for small Rs. 150");
            System.out.println("2 for large Rs. 300");
            int choice = sc.nextInt();
            System.out.println("Enter the number of addons ");
            int noofaddons = sc.nextInt();
            
            if (choice == 1) {

                price = price + (150 * noofaddons);
                System.out.println("Total price is : " + price);
            }
            if (choice == 2) {

                price = price + (300 * noofaddons);
                System.out.println("Total price is : " + price);
            }
        }
    }

    public void bookTicket()
    {
        search();
        seatSelection();
        addons();
    }
    
    public void cancelTicket()
    {
        System.out.println("Do u want to cancel your ticket ?  No / Yes ");
        String cancelChoice = sc.next();

        if (cancelChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Ticket has been cancelled");
            price = 0;
            System.out.println("Total amount refunded");
        } else {
            System.out.println("Enjoy the movie ");
        }

    }


}