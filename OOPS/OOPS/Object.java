package OOPS;
public class Object {

    static String college = "SGTBIMIT";   // static variable
    String name;                         //  non static variable
    String course;

    public static void main(String[] args) {

        Object o = new Object();
        o.name = "UTKARSH";
        o.course = "BCA";
        System.out.println("COLLEGE NAME : " + college + "\n" + "NAME : " + o.name + "\n" + "COURSE : " + o.course);

    }
}
