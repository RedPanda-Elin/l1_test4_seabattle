import java.util.Random;
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
        Random random = new Random();


        field.init();
        field.setShip(random.nextInt(10)); //todo сделать случайной

        int shoot;
        do{
            field.show();
            shoot = player.getShoot();
            field.doShoot(shoot);
    }

    while(field.isNotGameOver(shoot));
        System.out.println(field.isNotGameOver(shoot));
        System.out.println("Game Over");
}
}

// todo скрыть отображение корабля