package Java_starter_pracktise_plus_dz_lesson_1;

import java.util.Scanner;

public class l1_ThirdTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите радиус окружности:");
        float rad=scan.nextFloat();
        float pi=3.14F;
        double sqare=2*pi*rad;
        System.out.println(sqare);
    }
}
///площадь круга посчитали