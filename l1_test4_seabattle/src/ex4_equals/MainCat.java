package ex4_equals;

import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * Created by Elin on 16.11.2017.
 */
public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty", 3);
        Cat cat2 = new Cat("Kitty", 53);

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(Objects.equals(cat1, cat2));
    }
}
