package Main_oops.Inheritance.multi_Level;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        System.out.println("===================");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("===================");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

    }
}
