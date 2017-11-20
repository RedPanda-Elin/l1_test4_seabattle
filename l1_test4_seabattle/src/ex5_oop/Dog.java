package ex5_oop;

import java.util.Objects;

/**
 * Created by Elin on 18.11.2017.
 */
public class Dog extends Animal {
//    Animal super; метафора
    String owner;

    void wow() {
        System.out.println("WoW");
    }


    void move() {
//        super.move();
        System.out.println("за кошкой");
    }
}
