package ex5_oop;

/**
 * Created by Elin on 18.11.2017.
 */
public class Crocodile extends Animal {
    public Crocodile(String s, int age) {
        super(s,age);
    }

    public Crocodile() {

    }

    @Override
    void move() {
        System.out.println("крокодил летает, но очень низко");
    }
}
