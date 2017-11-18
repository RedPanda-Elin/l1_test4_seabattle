package ex3_static;

/**
 * Created by Elin on 09.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Cat.showCatsCount();
//        System.out.println(Animal.count);
        Cat cat = new Cat("Murka");
        Cat cat2 = new Cat("Murka");
        Cat cat3 = new Cat("Murka");
//        System.out.println(Animal.count);

        Cat.showCatsCount();
//        Home home = new Home();
//        home.createCat();
//        System.out.println(Home.cat);

    }
}
