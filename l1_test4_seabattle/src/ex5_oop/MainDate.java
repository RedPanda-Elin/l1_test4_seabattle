package ex5_oop;

/**
 * Created by Elin on 18.11.2017.
 */
public class MainDate {
    public static void main(String[] args) {
        Date date = new Date();
//        date.day = 28;
//        date.month = 2;
//        date.day++;
//        date.day++;
        date.setDay(11);
        date.setDay(32);
        System.out.println(date.getDay());



    }
}
