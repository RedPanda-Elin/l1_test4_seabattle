package ex1_arraylist;

import java.util.ArrayList;

/**
 * Created by Elin on 17.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList cells = new ArrayList<String>();
        cells.add("X");
        cells.add("0");
        cells.add("X");
        cells.add("0");
        cells.add("X");
        cells.add(23);
        cells.add(23.2);
        cells.add(new Main());
        System.out.println(cells);
//        System.out.println(cells.get(0));
//        cells.remove(1);
//        cells.remove("0");
        while (cells.remove("0")); // Ctrl - J
        System.out.println(cells);
        cells.clear();
        System.out.println(cells);
    }
}
