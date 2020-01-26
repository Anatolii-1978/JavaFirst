//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
// показана символами ||, эти символы в массив не входят.

public class Task_6 {
    public static void main(String[] args) {
        class Main {
            int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
            int[] arrLeft = new int[arr.length];
            int[] arrRight = new int[arr.length];
            int leftSum = arr[0], rightSum = arr[arr.length - 1];

            for (int i = 1; i<=arr.length-1; i++) {
                leftSum += arr[i];
                arrLeft[i] = leftSum;
                }

            for (int j = arr.length - 2; j <= 0; j--) {
                rightSum += arr[j];
                arrRight[j] = rightSum;
                }

            /*for (int i = 0; i < arrLeft.length; i++) {
                System.out.print(arr[i] + " ");
                }

           // for (int i = 0; i < arrLeft.length; i++) {
                System.out.print(arr[i] + " ");
                }*/

                //if (leftSum == rightSum) return true; }
                //return false;

            }
        }
    }








