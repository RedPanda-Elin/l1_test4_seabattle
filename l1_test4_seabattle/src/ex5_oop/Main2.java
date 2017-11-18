package ex5_oop;

import java.util.ArrayList;

/**
 * Created by Elin on 19.11.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Crocodile());
        animals.add(new Dog());


        Animal a = new Crocodile();// ПОЛИМОРФИЗМ - ключевое понятие в объектном программировании
        for (Animal animal : animals) {
            animal.move();

        }
    }
    
}
