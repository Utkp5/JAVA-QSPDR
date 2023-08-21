package OOPS;

public class Constructor_overloading {
    
    String first_name, second_name, actor, actress;
    int budget;


    Constructor_overloading(String first_name, String second_name, String actor, String actress, int budget)
    {
        System.out.println("Has all the vales");
        this.first_name  =  first_name;
        this.second_name =  second_name;
        this.actor       =  actor;
        this.actress     =  actress;
        this.budget      =  budget; 
    }
    
    Constructor_overloading()
    {
        System.out.println("Empty Constructor");
    }
    

    Constructor_overloading (String first_name, String actor, String actress, int budget)
    {
        System.out.println("This constructor without second name");
        this.first_name  = first_name;
        this.actor       = actor;
        this.actress     = actress;
        this. budget     = budget;
    }

// Constructor with same datatype and same sequence is not allowed 
//     Constructor_overloading(String first_name, String second_name, String actor, int budget)
//    {
//         this.first_name  = first_name;
//         this.second_name = second_name;        
//         this.actor       = actor;
//         this.budget      = budget;
//     }

    public static void main(String[] args) {
        
        Constructor_overloading co1 = new Constructor_overloading("Chennai", "Express", "SRK", "Deepika",100);
        System.out.println(co1.first_name + "\t" + co1.second_name + "\t" + co1.actor + "\t" + co1.actress + "\t" +  co1.budget);
        Constructor_overloading co2 = new Constructor_overloading("Kick","Salman","Jacqualine",100);
        System.out.println(co2.first_name + "\t" + co2.actor + "\t" + co2.actress + "\t" +  co2.budget);
        
    }
    
}






 