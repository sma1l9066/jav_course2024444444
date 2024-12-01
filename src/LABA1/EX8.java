package LABA1;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите День недели: ");
        String dotw = in.nextLine();

        System.out.println("Напишите какой сейчас месяц: ");
        String month = in.nextLine();

        System.out.println("Укажите число месяца: ");
        int dotm = in.nextInt();

        System.out.println("Укажите год: ");
        int year = in.nextInt();


        System.out.println("Сегодня : " + dotw + " " + month + " " + dotm + " " + year +"г.");

        in.close();

    }
}
