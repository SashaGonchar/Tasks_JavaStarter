package Java_starter_practice_lesson_7;

import java.io.File;
import java.util.Scanner;

//Реализуйте метод который выведет на экран список всех
//каталогов которые «лежат» в каталоге который будет
//параметром этого метода.
public class l7_ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите абсолютный путь к каталогу,содержимые каталоги которого, хотите посмотреть:");
        String folderLocation = scan.nextLine();
        folderList(folderLocation);
    }

    static void folderList(String nameFolder) {
        File folder = new File(nameFolder);
        File[] listFold = folder.listFiles();
        for (int i = 0; i < listFold.length; i++) {
            System.out.println(isItDirectory(listFold[i]));
        }
    }
    static String isItDirectory(File file) {
        String nameFile = file.getName();
        String res = "";
        String type = "Directory";
        if (file.isDirectory()) {
            res = String.format("%-10.10s\t%-10.10s", nameFile, type);
        }
        return res;
    }
}

