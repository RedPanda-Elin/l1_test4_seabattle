/**
 * Created by Elin on 25.08.2017.
 */
public class Field {
    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void init() {

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void show() {
        System.out.println(cells);
        System.out.println();

    }

    void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Мимо");
                cells[shoot] = '*';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Уже стреляли");
                break;
            case 'X':
                System.out.println("Корабль потоплен");
                cells[shoot] = '$';
                System.out.println(cells);
                break;
            default:
                System.out.println("Ошибка");
        }
    }



    boolean isNotGameOver(int x) {
        boolean result;
        if (cells[ship.position] == x) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }


    void setShip(int position) {
        ship = new Ship();
        ship.position = position;
        cells[position] = 'X';
    }
}

