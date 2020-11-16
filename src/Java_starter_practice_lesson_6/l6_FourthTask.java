package Java_starter_practice_lesson_6;

import java.util.Formatter;

//Выведите на экран 10 строк со значением числа Пи. Причем в первой
//строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.
public class l6_FourthTask {
    public static void main(String[]args){

        for (int after_decimal=2; after_decimal<11; after_decimal++) {
            PI_with_a_points_after_decimal(after_decimal);
        }
    }
    public static int PI_with_a_points_after_decimal(int a){
        Formatter form=new Formatter();
        form.format("%."+a+"f", Math.PI);
        String text = form.toString();
        System.out.println(text);
        return a;
    }
}
