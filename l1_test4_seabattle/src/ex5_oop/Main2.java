package ex5_oop;

import java.util.ArrayList;

/**
 * Created by Elin on 19.11.2017.
 */
public class Main2 {
    public static void main(String[] args) {
//        ArrayList<Animal> animals = new ArrayList<Animal>();
//        animals.add(new Cat());
//        animals.add(new Dog());
//        animals.add(new Crocodile());
//        animals.add(new Dog());

        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Crocodile();
        animals[3] = new Dog();


        Animal a = new Crocodile();// ПОЛИМОРФИЗМ - ключевое понятие в объектном программировании
        for (Animal animal : animals) {
            animal.move();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.wow();
            }

        }
    }
    
}
