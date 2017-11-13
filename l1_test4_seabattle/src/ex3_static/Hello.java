package ex3_static;

/**
 * Created by Elin on 13.11.2017.
 */
public class Hello {
    public static void main(String[] args) {
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        System.out.println("кошек: " + Cat.count);
    }
}
