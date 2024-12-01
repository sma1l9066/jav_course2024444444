package LABA1;

import java.util.Scanner;

public class EX6 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Напиши фамилию: ");
            String Firstname = in.nextLine();

            System.out.println("Напиши Имя: ");
            String Name = in.nextLine();

            System.out.println("Напиши отчество: ");
            String Surname = in.nextLine();

            System.out.println("Привет! : " +Firstname +" " +Name +" " +Surname);

            in.close();

        }
    }


