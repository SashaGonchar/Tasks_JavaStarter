package Java_starter_practise_plus_dz_lesson_2;

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
