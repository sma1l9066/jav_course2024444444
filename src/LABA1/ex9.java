package LABA1;
import java.util.Scanner;
public class ex9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите месяц:");
        String firstname = in.nextLine();

        System.out.println("Напишите количество дней:");
        int day = in.nextInt();


        System.out.println("Месяц:" + firstname + " количество дней " + day);


        in.close();
    }


}
