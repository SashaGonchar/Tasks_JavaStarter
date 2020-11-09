package Java_starter_pracktise_dz_lesson_3;

import java.util.Scanner;

public class l3_SecondTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ведите число n (4<n<16), от которого хотите взять факториал:");
        int num=scan.nextInt();
        long fact=1;
        if (num>4 && num<16){
        for (int i=num;i>0;i--){
            fact=fact*i;
            }
        System.out.println(fact);
        }
        else{
            System.out.println("Введите число из заданого диапазона");
        }
    }
}
