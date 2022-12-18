import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = sc.nextInt();
        Random randint = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            list.add(randint.nextInt(20));
        }

        System.out.println("Сгенерированый список -> " + list);

        delOdd(list);

        System.out.println("Список после удаления четных чисел -> " + list);
    }

    public static ArrayList<Integer> delOdd(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
        return array;
    }
}
