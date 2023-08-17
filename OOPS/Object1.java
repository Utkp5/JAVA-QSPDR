package OOPS;
public class Object1 {

    static String college = "SGTBIMIT";   
    String name;                         
    String course;

    //Before main method ***static block**** will execute always 

    static {
        System.out.println("===Welcome To Data Viewer===");
    }

    public static void main(String[] args) {

        Object1 o = new Object1();
        o.name = "UTKARSH";
        o.course = "BCA";
        System.out.println("COLLEGE NAME : " + college + "\n" + "NAME : " + o.name + "\n" + "COURSE : " + o.course);

    }
}
