package Java_starter_practice_lesson_1;
//Написать программу которая считывает 5-и значное число с
//клавиатуры и выводит цифры из которого оно состоит.
//Например : Считывается число 54698
import java.util.Scanner;

public class l1_FirstTask {
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Ведите свое число:");
    int num=scan.nextInt();

    String num_to_string=Integer.toString(num);
    int num_to_string_length=num_to_string.length();
    int zero=0;

    while(zero < num_to_string_length){
        char vivod_v_stroku= num_to_string.charAt(zero++);
        System.out.println(vivod_v_stroku);
    }
    }
}
///тут выводили число в столбик