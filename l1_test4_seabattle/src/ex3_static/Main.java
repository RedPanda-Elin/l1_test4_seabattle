package ex3_static;

/**
 * Created by Elin on 09.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.count);
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        System.out.println(Cat.count);

    }
}
