package ex5_oop;

/**
 * Created by Elin on 18.11.2017.
 */
public class Cat extends Animal { // Cat расширяет, наследует Animal
    // Cat является потомком Animal
        String householder;

    public Cat() {
    }

    void move() {
        System.out.println("крадучись за мышкой");
    }
}
