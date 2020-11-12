package Java_starter_practice_lesson_5;
//Напишите метод который реализует линейный поиск элемента в массиве
//целых чисел. Если такой элемент в массиве есть то верните его индекс,
//если нет то метод должен возвращать число - «-1»

import java.util.Arrays;
import java.util.Scanner;

public class l5_FourthTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которое хотите искать в масиве:");
        int element_to_search = scan.nextInt();
        System.out.println("Введите размерность желаемого масива, которой будет сгенирирован случайно");
        int arr_length = scan.nextInt();
        int [] arr = new int[arr_length];
        for (int index = 0; index < arr.length - 1; index++) {
            arr[index] = (int) (Math.random() * 10);
        }
        System.out.println("Сгенерированный масив"+ Arrays.toString(arr));
       System.out.println(linear_search(arr,element_to_search));
    }

    static int linear_search(int [] arr, int element_to_search) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element_to_search)
                return index;
        }
        return -1;
    }
}
