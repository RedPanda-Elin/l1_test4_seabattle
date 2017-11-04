import java.util.Random;

/**
 * Created by Elin on 25.08.2017.
 */
public class Ship {
    public static final int MAX_SHIP_SIZE = 3;
    int position;
    int size;

    void initWithRandom() {
        Random random = new Random();
        size = 1 + random.nextInt(MAX_SHIP_SIZE); // [1;3]
        position = random.nextInt (Field.SIZE - size + 1); // [0;8]




//        size = 1 + (int) (Math.random() * MAX_SHIP_SIZE); // написали единичку, чтобы не выдавало 0
//        position = (int) (Math.random() * (Field.SIZE - size + 1)); // ......

    }

}
