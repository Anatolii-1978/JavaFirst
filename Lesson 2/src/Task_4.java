//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами;

public class Task_4 {
    public static void main(String[] args) {
        int [][] tab = new int[9][9];
        int b=0; int d = 8;
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if ((i==b && j==b) || (i==b && j==d)){
                    tab[i][j] = 1;
                }
            }
            b++; --d;

        }
        for (int i=0; i<9; i++){
            for(int j=0;j<9; j++)
                System.out.print(tab[i][j]+" ");
            System.out.println();
        }

    }
}
