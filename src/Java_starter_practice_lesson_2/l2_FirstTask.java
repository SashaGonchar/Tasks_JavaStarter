package Java_starter_practice_lesson_2;
//Написать программу которая считает 4 числа введенные с клавиатуры и выведет наибольшее из них
import java.util.Scanner;

public class l2_FirstTask {
    public static void  main (String[]args){
        Scanner scan=new Scanner(System.in);

        System.out.println("введите 4 числа");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();

        if ((a>b)&&(a>c)&&(a>d)) {
            System.out.println("самое большое число:"+a);
        }
        else if (b>=a&&b>=c&&b>=d){
            System.out.println("самое большое число:"+b);
        }
        else if (c>=a&&c>=b&c>=d){
            System.out.println("самое большое число:"+c);
        }
        else if (d>=a){
            System.out.println("самое большое число:"+d);
        }
        else{
            System.out.println("Kak ti eto sdelal????????");
        }
    }
}
