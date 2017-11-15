package ex4_equals;

/**
 * Created by Elin on 14.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
        string2 = "bye";

        System.out.println(string1 == string2);
    }
}
