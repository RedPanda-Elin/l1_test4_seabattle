package ex5_oop;

/**
 * Created by Elin on 18.11.2017.
 */
public class Home {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Kitty";
//        cat.wow();
        cat.move();

        Dog dog = new Dog();
        dog.name = "Sharik";
        dog.wow();
        dog.move();

        System.out.println(cat.name);

        Crocodile crocodile = new Crocodile("Gena", 13);
        crocodile.move();
        crocodile.about();
    }
}
