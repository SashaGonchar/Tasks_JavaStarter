package Java_starter_practice_lesson_3;
//напечатать таблицу умножения на 5
public class l3_ThirdTask {
    public static void main(String[]args){

        int i=5;
        int ink=0;
        for (int j=0; j<10; j++){
            ink=ink+1;
            int sum=i*ink;
            System.out.println(i+"*"+ink+"="+sum);
        }
    }
}
