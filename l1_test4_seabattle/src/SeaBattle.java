import java.util.Scanner;

/**
 * Created by Elin on 22.08.2017.
 */
public class SeaBattle {
    public static void main(String[] args) {
        doGame(); // alt-enter
    }

    static void doGame() {
        Field field = new Field();
        Player player = new Player();

        field.init();
        field.setShip(4);

        do{
            field.show();
            int shoot = player.getShoot();
    } while();
        System.out.println("Hello");
}
}
