package LABA1;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите Имя: ");
        String name = in.nextLine();

        System.out.println("Напишите ваш возраст: ");
        int age = in.nextInt();


        System.out.println("Ваше Имя и возраст: " + name +" " + age);


        in.close();


    }
}
