package Java_starter_practice_lesson_7;
//Напишите метод для сохранения в текстовый файл
//двухмерного массива целых чисел
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class l7_SecondTask {
    public static void main(String[] args) {
        new File("fileWithArr.txt");
        int[][] b = new int[2][5];
        try (PrintWriter a = new PrintWriter("fileWithArr.txt")) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < b[0].length; j++) {
                   a.print(b[i][j] = (int) (Math.random() * 10));
                }
                a.println("");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
