package ex4_equals;

import java.util.Objects;

/**
 * Created by Elin on 14.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
//        string2.toLowerCase();
//        string2 = "bye";
        String temp = "hell";
        String string3 = temp + "o"; // еще один адрес

        System.out.println(string1 == string2);
        System.out.println(string1.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string1 == string3);


//        System.out.println(Objects.equals(string1, string3));

        string1 = null;


//        System.out.println(Objects.equals(string1, string3));

        System.out.println(Objects.equals(string1,string3));

    }
}
