package Java_starter_practice_lesson_5;

import java.util.Scanner;
//Напишите метод который вернет количество слов в строке текста.

public class l5_FifthTask {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите предложение, в коротом хотите узнать колличество слов:");
        String sentence=scan.nextLine();
        System.out.println("В вашем предложении "+word_counter(sentence)+" слов");
    }
     static int word_counter( String str){
            int count = 1;
         for (int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ') {
                count++;
            }
        }
        return count;
    }

}
