package LABA1;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите ваше Имя: ");
        String name = in.nextLine();

        System.out.println("Напишите ваш год рождения: ");
        int year = new Scanner(System.in).nextInt();
        System.out.println("Ваше имя и возраст: " +name +" " + getAge(year));
    }

    private static int getAge(int year) {
        return 2024 - year;


    }
}
