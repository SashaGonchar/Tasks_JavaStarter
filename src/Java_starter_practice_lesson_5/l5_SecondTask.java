package Java_starter_practice_lesson_5;

import java.util.Scanner;

//Реализуйте метод параметрами которого являются - целое число,
//вещественное число и строка. Возвращает он конкатенацию строки с
//суммой вещественного и целого числа.
public class l5_SecondTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите целочисленное первое число:");
        int num = scan.nextInt(); 
        System.out.println("Введите вещественное ворое число:");
        double num2 = scan.nextDouble();
        System.out.println("Введите текс, который хотите видеть перед уравнением:");
        String str = scan.next();
        System.out.print(string_element(str)+double_element(num,num2));
    }

    static double double_element(double a,double b) {
        return a+b;
    }
    static String  string_element(String a) {
        return a;
    }

}