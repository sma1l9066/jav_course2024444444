package LABA1;
import java.util.Scanner;
public class ex10 {

    public static void main(String[] args) {
        System.out.print("Год рождения: ");

        int year = new Scanner(System.in).nextInt();
        System.out.println("Ваш возраст: " + getAge(year));
    }

    private static int getAge(int year){
        return 2024 - year;
    }


}
