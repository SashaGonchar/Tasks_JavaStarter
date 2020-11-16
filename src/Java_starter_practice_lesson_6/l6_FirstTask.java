package Java_starter_practice_lesson_6;
//Написать программу которая вернет количество миллисекунд
//прошедших от такого же числа, но в прошлом месяце до сегодняшней
//даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
//прошло с 3 июля.
import java.util.Date;

public class l6_FirstTask {
    public static void main (String[] args){
    Date previous_month_date=new Date();
     previous_month_date.setMonth(previous_month_date.getMonth()-1);
     Date current_time=new Date();
     long data_diff=current_time.getTime()-previous_month_date.getTime();
        System.out.print("С этого же числа прошлого месяца прошло:"+data_diff+"милисекунд");
    }
}
