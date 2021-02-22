import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

public static char[][] map;
public static int sizeMapX;
public static int sizeMapY;

public static char humanChar = 'X';
public static char aiChar = '0';
public static char emptyChar = ' ';

public static Scanner scanner = new Scanner(System.in);
public static Random random = new Random();

public static void  createMap() {
    sizeMapX = 3;
    sizeMapY = 3;
    map = new char[sizeMapY][sizeMapX];

    for (int y = 0; y < sizeMapY; y++) {
        for (int x = 0; x < sizeMapX; x++) {
            map[y][x] = emptyChar;
        }
    }
}

public static void printMap() {
    for (int y = 0; y < sizeMapY; y++) {
        for (int x = 0; x < sizeMapX; x++) {
            System.out.print(map[y][x] + " | ");
        }
        System.out.println();
    }
    System.out.println("---------------");
}

public static void humanTurn() {
    int x;
    int y;

    do {
        System.out.println("Введите координаты:");
        x = scanner.nextInt() - 1;
        y = scanner.nextInt() - 1;
    } while (!isValidCell(y, x) || !isEmpty(y, x));

    map[y][x] = humanChar;
}
public static void aiTurn() {
    int x;
    int y;

    do {
        x = random.nextInt(sizeMapX);
        y = random.nextInt(sizeMapY);
    } while (!isEmpty(y, x));

    map[y][x] = aiChar;
}
public static boolean isValidCell(int y, int x) {return x >= 0 && x < sizeMapX && y >=0 && y < sizeMapY;}

public static boolean isEmpty(int y, int x) {return map[y][x] == emptyChar;}

//public static boolean checkWin(char playerChar){
    //if (map[0][0] == playerChar && map[0][1] == playerChar & map[0][2] == playerChar) return true;
    //if (map[1][0] == playerChar && map[1][1] == playerChar & map[1][2] == playerChar) return true;
    //if (map[2][0] == playerChar && map[2][1] == playerChar & map[2][2] == playerChar) return true;

    //if (map[0][0] == playerChar && map[1][0] == playerChar & map[2][0] == playerChar) return true;
    //if (map[0][1] == playerChar && map[1][1] == playerChar & map[2][1] == playerChar) return true;
    //if (map[0][2] == playerChar && map[1][2] == playerChar & map[2][2] == playerChar) return true;

    //if (map[0][0] == playerChar && map[1][1] == playerChar & map[2][2] == playerChar) return true;
    //if (map[0][2] == playerChar && map[1][1] == playerChar & map[2][0] == playerChar) return true;
    //return false;
//}

    public static   boolean checkWin(char symb) {
        boolean cols, rows;
        for (int col = 0; col < 3; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < 3; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }

            if (cols || rows) return true;
        }
        return false;
    }

        public static boolean isMapFull() {
    for (int y = 0; y < sizeMapY; y ++) {
        for (int x = 0; x <sizeMapX; x ++) {
            if (map[y][x] == emptyChar){
                return false;
            }
        }
    }
    return true;
}

public static void main(String[] args) {
    createMap();
    printMap();

    while (true) {
        humanTurn();
        printMap();
        if (checkWin(humanChar)) {
            System.out.println(humanChar + " WIN");
            break;
        }
        if (isMapFull()) {
            System.out.println("DRAW");
            break;
        }
        aiTurn();
        printMap();
        if (checkWin(aiChar)) {
            System.out.println(aiChar + " WIN");
            break;
        }
        if (isMapFull()) {
            System.out.println("DRAW");
            break;
        }
    }
}
}
