package Project_1;

class Comedy extends BookMyShow{

    int price = 0;

    @Override
    public void search()
    {
        System.out.println("Enter the Comedy show you want to watch");
        System.out.println("press 1 for Standup / 2 for Show");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Enter the show you want to watch");
            System.out.println("Munawar show  / Harsh show");
            String showSelect = sc.next();
            System.out.println("Enjoy watching the " + showSelect);
            
        } else {

            System.out.println("Enter the show you want to watch");
            System.out.println("Zakir show  / Bassi show");
            String showSelect = sc.next();
            System.out.println("Enjoy watching the " + showSelect);
            
        }
    }
    
    
    public void seatSelection()
    {
        System.out.println("Enter the Number of seats u want to book");
        int seatBook = sc.nextInt();
        System.out.println("Price for 1 seat is Rs.500");
        price = price + (500 * seatBook);
        System.out.println("Total amount to pay is Rs." + price);
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

}