package Java_starter_practice_lesson_6;

import java.util.Scanner;

//Ввести с консоли число в бинарном формате. Перевести его в
//десятичный и вывести на экран (“10” -> 2).
public class l6_ThirdTask {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в двоичном формате:");
        String num=scan.nextLine();
        int bin_to_dem = Integer.parseInt(num , 2);
        System.out.println("Ваше число в двоичном виде: "+bin_to_dem);

    }
}
