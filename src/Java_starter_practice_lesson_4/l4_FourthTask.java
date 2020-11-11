package Java_starter_practice_lesson_4;

import java.util.Scanner;

//Введите строку текста с клавиатуры — реализуйте программу для
//возможности подсчета количества символа — 'b' в этой строке, с выводом
//результат на экран.
public class l4_FourthTask {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите предложение на английском языке и я посчитаю количество букв 'b' в вашем приложении: ");
        String str= scan.nextLine();
        char [] string_to_array = str.toCharArray();
        char symbol= 'b';
        int symbol_counter=0;
        for (int string_length=string_to_array.length; string_length>0; string_length-- ){
        boolean compare= string_to_array[string_length-1]==symbol;
            if (compare){
                symbol_counter++;
            }
        }
        System.out.println("в вашем предложении "+symbol_counter+" символов "+symbol);
    }
}
