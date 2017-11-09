package ex3_static;

/**
 * Created by Elin on 09.11.2017.
 */
public class Cat {
    String name;
    int age;
    static int count;


    Cat() {
        System.out.println("Cat()");
        count++;

    }

}
