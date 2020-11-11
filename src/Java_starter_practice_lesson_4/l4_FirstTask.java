package Java_starter_practice_lesson_4;
//дан масив. Написать программу для подсчета нечетных чисел в нем
import java.util.Arrays;

public class l4_FirstTask {
    public static void main(String[]args){
    int[] mas={0, 5, 2, 4, 7, 1, 3, 19};
        Arrays.sort(mas);
        for(int num : mas){
            int division_without_remainder=num%2;
            if (division_without_remainder == 1){
                System.out.print(num+" ");
            }
        }
    }
}
