package Java_starter_practice_lesson_3;
//Вывести на экран прямоугольник из звездочек. ширина и высота прямоугольника задаеться вручную.
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
