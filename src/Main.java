import java.util.*;
import java.util.stream.IntStream;

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

        findMaxValue(list);
        findMinValue(list);
        findAverage(list);

//        delOdd(list);

//        System.out.println("Список после удаления четных чисел -> " + list);
    }

    public static ArrayList<Integer> delOdd(ArrayList<Integer> array) {   // Функция удаления элементов ссписка с четными числами
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
        return array;
    }

    public static void findMaxValue(ArrayList<Integer> array) {     // Функция нахождения максимального значения
        int max = array.get(0);
        for (int i: array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println( "Максимальный элемент списка со значением ->" + max);
    }

    public static void findMinValue(ArrayList<Integer> array) {     // Функция нахождения минимального значения
        int min = array.get(0);
        for (int i: array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальный элемент списка со значением ->" + min);
    }

    public static void findAverage(ArrayList<Integer> array) {    // Функция нахождения среднего арифметического
//        OptionalInt average = Arrays.stream(array).average(); полчему-то таким способом не получается решить, идея ругается.
        int average = 0;
        for(int i: array) {
            average = average + i;
        }
        double result = average / array.size();
        System.out.println( "Среднее арифметическое значение элементов списка -> " + result);
    }
}
