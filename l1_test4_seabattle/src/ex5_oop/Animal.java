package ex5_oop;

/**
 * Created by Elin on 16.11.2017.
 */
public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void move() {
        System.out.println("??? some moving");
    }

    void about() {
        System.out.println(name +" " + age);
    }
}
