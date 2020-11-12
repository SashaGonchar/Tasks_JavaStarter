package Java_starter_practice_lesson_5;
//Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
//— его параметрами будут целые числа которые описывают длину и
//ширину такого прямоугольника.
import java.util.Scanner;

public class l5_ThirdTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника:");
        int width=scan.nextInt();
        System.out.print("Введите высоту прямоугольника:");
        int height=scan.nextInt();
        draw_a_rectangle(width,height);
    }

    static int draw_a_rectangle(int a, int b){
        for(int zero=0; zero<a;zero++){
            System.out.print("*");
        }
        System.out.println("");

        for(int zero=2; zero<b;zero++){
            System.out.print("*");
            for(int space=2; space<a;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }

        for(int zero=0; zero<a;zero++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Прямоугольник нарисован при помощи метода!");
        return 0;
    }
}
