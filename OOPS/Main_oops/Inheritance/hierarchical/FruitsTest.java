package Main_oops.Inheritance.hierarchical;

public class FruitsTest {
    public static void main(String[] args) {

        Fruits f = new Fruits();
        f.eat();        f.makeJuice();
        System.out.println("=======================");
        Apple a = new Apple();
        a.eat();        a.makeWine();        a.makeJuice();
        System.out.println("=======================");
        Banana b = new Banana();
        b.eat();     b.makeJuice(); b.makeShake();

    }    


}
