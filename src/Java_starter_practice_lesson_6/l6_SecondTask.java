package Java_starter_practice_lesson_6;

import java.util.Arrays;
import java.util.Scanner;

//Написать свой вариант метода Arrays.toString() для int[].
public class l6_SecondTask {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите желаемую размерность масива:");
        int arr_length=scan.nextInt();
        intArr_toString(set_random_arr(arr_length));

    }
    public static int[] set_random_arr(int arr_length){
        int [] arr = new int[arr_length];
        for (int index=0; index<arr.length-1; index++){
            arr [index] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static int intArr_toString(int[] arr){
        if (arr.length>0) {
            System.out.print("[");
            for (int index = 0; index < arr.length; index++) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print("]");
        }
        else{
            System.out.print("["+arr[0]+"]");
        }
        return 0;
    }
}
