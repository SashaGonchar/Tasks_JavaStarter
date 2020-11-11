package Java_starter_practice_lesson_5;

import java.util.Arrays;
import java.util.Scanner;
//Напишите метод который вернет максимальное число из массива целых
//чисел.
public class l5_FirstTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите желаемую размерность масива:");
        int mas_length=scan.nextInt();
        int [] mas = new int[mas_length];
            for(int index=0;index<mas.length-1;index++){
                mas[index]= (int) (Math.random()*10);
            }
            System.out.println(Arrays.toString(mas));
            System.out.println(the_largest_num(mas));
    }

    public static int the_largest_num(int... a) {
        Arrays.sort(a);
        return a[a.length-1];
    }
}
