package Java_starter_practice_lesson_7;

import java.io.*;
import java.util.Scanner;

//Создайте консольный «текстовый редактор» с возможностью
//сохранения набранного текста в файл.
public class l7_FirstTask {

    public static void main(String[] args) {

        String textFromNotepad = loadFromFile(new File("notepad.txt"));// считали файл

        StringBuilder editedText = editingFile(textFromNotepad);//отредактировали файл

        String rewritingCompleted = writeToFile(editedText);//записали файл

        System.out.println(rewritingCompleted);
    }

    public static String loadFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String text;
            while ((text = br.readLine()) != null) {
                sb.append(text).append(System.lineSeparator());
            }
        } catch (IOException ignored) {

        } return sb.toString();
    }

    public static StringBuilder editingFile(String textFromNotepad){
        Scanner scan=new Scanner(System.in);
        StringBuilder editor= new StringBuilder(textFromNotepad);// создали стрингибилдер, что б использовать метод едитор
        System.out.println("Скопируйте ранее сохраненный в файле текст и перевведите его с внесением ваших изменений. Текст файла начинается со следующей строки");
        System.out.println(textFromNotepad);
        String editedString=scan.nextLine();//то на что меняем существующий текст
        editor.replace(0,textFromNotepad.length(),editedString);//теперь в строке нужный нам текст
        return editor;
    }

    public static String writeToFile(StringBuilder newText){
        try (PrintWriter print=new PrintWriter("notepad.txt")){
            print.println(newText);
        }catch(FileNotFoundException e){
            System.out.println("Некуда перезаписывать, файл был удален");
        }
        return "файл перезаписан";
    }
    }


