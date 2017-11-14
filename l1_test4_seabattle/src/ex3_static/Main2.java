package ex3_static;

/**
 * Created by Elin on 09.11.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom"); // в миску положили 100 еды
        Cat cat2 = new Cat("Kitty");
        Cat cat3 = new Cat("Murka");

        cat1.eat();
        cat2.eat();
        cat2.eat();
        cat2.eat();
        cat3.eat();

        cat1.eat();
    }
}
