
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Task_1 {
    public static void main(String[] args) {
        int [] n = {1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1 ,1, 0};
        for (int i = 0; i<n.length; i++){
            if (n[i]==0){
                n[i]=1;}
            else{
                n[i]=0;}
            }
        for (int valua:n){
            System.out.print(valua);}
        }


    }

