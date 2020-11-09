package Java_starter_pracktise_plus_dz_lesson_1;

import java.util.Scanner;

public class l1_SecondTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("введите 1 строну треугольника");
        float x =scan.nextFloat();
        System.out.println("введите 2 строну треугольника");
        float y=scan.nextFloat();
        System.out.println("введите 3 строну треугольника");
        float  z=scan.nextFloat();

        double half_perimetr=(x+y+z)/2;
        double sqare_treugolnica= Math.sqrt(half_perimetr*((half_perimetr-x)*(half_perimetr-y)*(half_perimetr-z)));
        System.out.print(sqare_treugolnica);
    }
}
///тут считали площадь квадрата