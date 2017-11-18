package ex3_static;

/**
 * Created by Elin on 09.11.2017.
 */
public class Cat {
    String name;
    int age;
    static int count;
//    int plate = 100; // у каждой кошки своя миска
    static int plate = 100; // общая миска для всех кошек


//    static {
//        count = 1000; // если статик то будет вызываться только 1 раз при первом упоминании класса, если просто блок инициа
//    }

    Cat(String name) {
        this.name = name;
        System.out.println("Animal()");
        count++;
    }

    static void showCatsCount() {
        System.out.println(count);
    }

    void eat() {
        plate--;
        System.out.println("name "+ name + " plate: " + plate);
    }
    static void showPlate() {
        System.out.println("Еды в миске осталось: " + plate);

    }

    static Cat getRandomCat() {
        return new Cat("Котяшечко");
    }
}
