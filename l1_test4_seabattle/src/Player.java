import java.util.Scanner;

/**
 * Created by Elin on 25.08.2017.
 */
public class Player {
    static int getShoot() {
        int shoot;
        Scanner scanner = new Scanner(System.in);// BufferedReader
        do {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt();
                break;
            } else {
                System.out.println("введите все же именно число, пожалуйста");
                scanner.nextLine(); // выбросили то, что там было написано
            }
        } while (true);
        System.out.println("x: " + shoot);
        return shoot;
    }

}
