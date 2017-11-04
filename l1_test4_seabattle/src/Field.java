import java.util.ArrayList;

/**
 * Created by Elin on 25.08.2017.
 */
public class Field {
    static final int SIZE = 10;
    public static final int SHIPS_COUNT = 2;
    char[] cells;
    ArrayList<Ship> ships;

//    Ship[] ships;


    public Field() {
        cells = new char[SIZE];
//        ships = new Ship[SHIPS_COUNT];
        ships = new ArrayList<Ship>();
    }

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
                break;
            case '*':
                System.out.println("Уже стреляли");
                break;
            case 'X':
                System.out.println("Корабль потоплен или ранен!"); //todo делать проверку потоплен или ранен
                cells[shoot] = '$';
                System.out.println(cells);
                break;
            default:
                System.out.println("Ошибка");
        }
    }


    boolean isNotGameOver() {
        for (char cell : cells) {
            if (cell == 'X') {
                return true;
            }

        }
        return false;
    }

//
//    void setShip(int position) {
//        ship = new Ship();
//        ship.position = position;
//        cells[position] = 'X';
//    }

    public void setShip() {
        for (int i = 0; i < SHIPS_COUNT; i++) {
            Ship ship = getNewShipWithNoIntersections();
            ships.add(ship);
            drawShip(ship);
        }

    }
    private Ship getNewShipWithNoIntersections () {
        Ship tempShip = new Ship();
        boolean isInersect;
        do {
            isInersect = false;
            tempShip.initWithRandom(); //todo потенциальная проблема - вечный цикл
            for (Ship ship : ships) {
                if (isInersectTwoShips(tempShip, ship))                 {
                    isInersect = true;
                }
            }

        } while (isInersect);

        return tempShip;

    }

    private boolean isInersectTwoShips(Ship ship1, Ship ship2) {

        if (ship2.position + ship2.size < ship1.position) {
            return false; // хвост ship2 левее, чем ship1
        }
        if (ship1.position + ship2.size < ship2.position) {
            return false;
        }


        return true;
    }

    private  void drawShip(Ship ship) {
        for (int i = 0; i < ship.size; i++) {
            cells[ship.position +1] = 'X';
        }
    }
    int getMaxEmptyCells() {
        //анализ поля
        //вернем самое длинное не занятое место
        return 0;
    }
}

