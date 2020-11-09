package Java_starter_pracktise_dz_lesson_3;

import java.util.Scanner;

public class l3_FourthTask {
public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Введите ширину прямоугольника:");
    int width= scanner.nextInt();
    System.out.println("Введите высоту прямоугольника:");
    int height= scanner.nextInt();
        for (int zero=0;zero<width;zero++){
            System.out.print("*");
        }
    System.out.println();
        for (int zero=2;zero<height;zero++){
            System.out.print("*");
            for (int space=width-2;space>0;space--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    for (int zero=0;zero<width;zero++) {
        System.out.print("*");
    }
}
}
