package Java_starter_pracktise_dz_lesson_3;

import java.util.Scanner;

public class l3_FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество полос обоев:");
        int number_of_wallpaper_lines = scan.nextInt();
        int num_of_full_stripes = number_of_wallpaper_lines / 2;
        int chetnoe_ili_nechetnoe = number_of_wallpaper_lines % 2;
        for (int zero = 0; zero < 10; zero++) {
            if (chetnoe_ili_nechetnoe == 0) {
                for (int zero2 = 0; zero2 < num_of_full_stripes; zero2++) {
                    System.out.print("+++***");
                }
                System.out.println("");
            } else if (chetnoe_ili_nechetnoe == 1){
                for (int zero2 = 0; zero2 < num_of_full_stripes; zero2++) {
                    System.out.print("+++***");
                }
                System.out.println("+++");
            }
        }
    }
}