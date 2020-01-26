import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    private static boolean checkWin (char symb) {

        int H_count =0;
        int V_count = 0;
        int D1_count = 0;
        int D2_count = 0;
        int D3_1_count =0;
        int D3_2_count =0;
        int D4_1_count =0;
        int D4_2_count=0;


        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                if (map[i][j]==symb){
                    H_count++;
                }
            }

            if (H_count==DOTS_TO_WIN && ((map[0][i]!=DOTS_TO_WIN) ||(map[SIZE-1][i]!=DOTS_TO_WIN))){
                return true;
            }else{
                H_count=0;
            }
        }

        for (int i=0; i<SIZE;i++){
            if(map [i][0]==symb){
                V_count++;
            }
            if(map [i][1]==symb){
                V_count++;
            }
            if(map [i][2]==symb){
                V_count++;
            }
            if(map [i][3]==symb) {
                V_count++;
            }
            if(map [i][4]==symb) {
                V_count++;
            }

            if (V_count==DOTS_TO_WIN && ((map[i][SIZE-1]!=DOTS_TO_WIN) ||(map[i][0]!=DOTS_TO_WIN))){
                return true;
            }
        }

        for (int i=0; i<SIZE;i++){
            if (map[i][i] == symb) {
                D1_count++;
            }

            if (D1_count == DOTS_TO_WIN && ((map[0][0]!=DOTS_TO_WIN) ||(map[SIZE-1][SIZE-1]!=DOTS_TO_WIN))) {
                return true;
            }
        }

        int i, j;
        for (i=SIZE-1,  j=0; i>=0; i--, j++){
            if (map[j][i] == symb) {
                D2_count++;
            }

            if (D2_count == DOTS_TO_WIN && ((map[0][SIZE-1]!=DOTS_TO_WIN) ||(map[SIZE-1][0]!=DOTS_TO_WIN))) {
                return true;
            }
        }
        //int i, j;
        for (i=1,  j=0; i<SIZE; i++, j++){
            if (map[i][j] == symb) {
                D3_1_count++;
            }

            if (D3_1_count==DOTS_TO_WIN) {
                return true;
            }
        }

        int k, z;
        for (k=0, z=1; z<SIZE; k++, z++){
            if (map[k][z] == symb) {
                D3_2_count++;
            }
            if (D3_2_count==DOTS_TO_WIN) {
                return true;
            }
        }

        int a, b;
        for (a=3,  b=0; a<=0; a--, b++){
            if (map[a][b] == symb) {
                D4_1_count++;
            }

            if (D4_1_count==DOTS_TO_WIN) {
                return true;
            }
        }


        for (k=SIZE-1,  z=1; z<SIZE; k--, z++){
            if (map[k][z] == symb) {
                D4_2_count++;
            }
            if (D4_2_count==DOTS_TO_WIN) {
                return true;
            }
        }

        return false;
    }




    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

