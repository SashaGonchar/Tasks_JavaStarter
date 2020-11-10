package Java_starter_practice_lesson_2;
//Треугольник существует только тогда, когда сумма любых двух его
//сторон больше третьей. Дано: a, b, c – стороны предполагаемого
//треугольника. Напишите программу которая укажет существует такой
//треугольник или нет.
import java.util.Scanner;

public class l2_FourthTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
    System.out.println("Давайте узнаем существует ли наш треугольие. ВВедите три его стороны");
    float a=scan.nextInt();
    float b=scan.nextInt();
    float c=scan.nextInt();

    float ab= a+b;
    float ac= a+c;
    float bc= b+c;

    if ((ab>c)&&(ac>b)&&(bc>a)){

        System.out.println("треугольник существует");
    }
    else{
        System.out.println("треугольник не существует");
    }
    }
}
