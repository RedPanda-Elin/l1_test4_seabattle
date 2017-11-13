package ex3_static;

/**
 * Created by Elin on 09.11.2017.
 */
public class Cat {
    String name;
    int age;
    static int count;

//    static {
//        count = 1000; // если статик то будет вызываться только 1 раз при первом упоминании класса, если просто блок инициа
//    }


    Cat() {
        System.out.println("Cat()");
        count++;

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("dead");
    }
}
