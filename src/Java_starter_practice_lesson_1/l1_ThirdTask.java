package Java_starter_practice_lesson_1;
//Написать программу которая вычислит и выведет на экран
//длину окружности, если ее радиус считывается с клавиатуры.
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
