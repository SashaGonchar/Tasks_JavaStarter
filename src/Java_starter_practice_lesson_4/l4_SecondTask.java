package Java_starter_practice_lesson_4;
//написать код для возможности создания масива целых чисел (размер воодиться с клавиатуры)
//и возможности заполнения каждого его елемента вручную
import java.util.Arrays;
import java.util.Scanner;

public class l4_SecondTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите размер желаемого масива:");
        int mas_length=scan.nextInt();
        int [] mas=new int[mas_length];
        for(int index=0;index<mas_length;index++) {
            System.out.println("Введите значение"+index+"-го элемента масива");
            mas[index]= scan.nextInt();
        }
        System.out.print(Arrays.toString(mas));
    }
}
