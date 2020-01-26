import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int maxTryCount = 3;
        System.out.println("Отгадайте число от 0 до 9. У вас есть "+ maxTryCount+" попытки.");

        int num = (int) (Math.random()*9);
        //System.out.println(num);
        System.out.println("Введите число.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int answer = Integer.parseInt(s);


        for (int tryCount=1; tryCount<maxTryCount; tryCount++){
            if (num==answer){
                System.out.println("Поздравляем с победой!");
                break;
            }else if(answer>num){
                System.out.println("Вы ввели слишком большое число.");
            }else if(answer<num){
                System.out.println("Вы ввели слишком маленькое число.");
            }
            System.out.println("У вас осталось попыток: " + (maxTryCount-tryCount) );
            System.out.println("Введите число.");
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            String str = reader1.readLine();
            answer = Integer.parseInt(str);

        }
        System.out.println("Правильный ответ " + num);

    }
}

