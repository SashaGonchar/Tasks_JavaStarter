package Java_starter_practice_lesson_4;

import java.util.Arrays;
import java.util.Scanner;
//Создать массив случайных чисел (размером 15 элементов). Создайте
//второй массив в два раза больше, первые 15 элементов должны быть
//равны элементам первого массива, а остальные элементы заполнить
//удвоенных значением начальных
public class l4_ThirdTask {
public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Введите желаемую размерность масива:");
    int mas1_length=scan.nextInt();
    int [] mas1=new int[mas1_length];
    for (int index=0; index<mas1.length; index++){
        mas1 [index]= (int) (Math.random()*10);
    }
    System.out.println(Arrays.toString(mas1));
    int mas1_length_multiplied=mas1_length*2;
    int [] mas2=Arrays.copyOf(mas1,mas1_length_multiplied);
    int b=mas1_length-1;
    for (int index=1; index<=mas2.length/2;index++){
        int a=mas2[index-1]*2;
        System.out.println(a);
        mas2 [index+b]=a;

        }
    System.out.print(Arrays.toString(mas2));
    }
}