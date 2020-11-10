package Java_starter_practice_lesson_2;
//Определить количество дней в году, который вводит пользователь. В
//високосном годе - 366 дней, тогда как в обычном 365. Високосный год
//определяется по следующему правилу:
//Год високосный, если он делится на четыре без остатка, но если он
//делится на 100 без остатка, это не високосный год. Однако, если он
//делится без остатка на 400, это високосный год.
import java.util.Scanner;

public class l2_ThirdTask {
    public static void  main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("введите год,что бы унать высокостный ли он");
        int year=scan.nextInt();

        assert year==0:"в этом году же родился Исус Христос!!!!!!";

        int yeardelenniy_na4=year%4;        /////+
        int yeardelenniy_na100=year%100;    /////-
        int yeardelenniy_na400=year%400;    /////+

        if (yeardelenniy_na4==0&&yeardelenniy_na100!=0||yeardelenniy_na400==0){
            System.out.println("god visokostniy");
        }
        else {
            System.out.println("god  не visokostniy");
        }
    }
}
