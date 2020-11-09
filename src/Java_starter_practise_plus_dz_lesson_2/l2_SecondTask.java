package Java_starter_practise_plus_dz_lesson_2;

import java.util.Scanner;

public class l2_SecondTask {
    public static void  main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ведите номер нужной Вам квартиры в нашем трехподездном деветиэтажном доме:");
        int flat_num=scan.nextInt();
        int flat_etaz= (int) (flat_num/4.000001)+1;
        int flat_podezd=(int) (flat_etaz/9.0000001)+1;

        if(flat_etaz>27){
            System.out.println("Ваша квартира не находиться в нашем доме");
        }
        else if (flat_etaz>18){
            int flat_etaz_for_padik3=flat_etaz-18;
            System.out.println("Ваша квартира находиться в "+flat_podezd+" подезде на "+flat_etaz_for_padik3+" этаже");
        }
        else if(flat_etaz>9){
            int flat_etaz_for_padik2=flat_etaz-9;
            System.out.println("Ваша квартира находиться во "+flat_podezd+" подезде на "+flat_etaz_for_padik2+" этаже");
        }
        else{
            System.out.println("Ваша квартира находиться в "+flat_podezd+" подезде на "+flat_etaz+" этаже");
        }








    }
}
