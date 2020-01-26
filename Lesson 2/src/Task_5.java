//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

public class Task_5 {
    public static void main(String[] args) {
        int [] simpl = {12, 25, 4, 8, 96, 74, 56, 24, 36, 53, 47};
        int min = simpl[0];
        int max = simpl[0];
        for(int i=0; i<simpl.length; i++){
            if (min>simpl[i]){
                min = simpl[i];
            }
            if (max<simpl[i]){
                max=simpl[i];
            }
        }
        System.out.println("Минимальное число равно "+ min);
        System.out.println("Максимальное число равно "+ max);
    }
}
