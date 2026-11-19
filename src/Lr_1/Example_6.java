package Lr_1;

import java.util.Scanner;

public class Example_6 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи фамилию: ");
        String surname = in.nextLine();
        System.out.println("Введи имя: ");
        String name = in.nextLine();
        System.out.println("Введи отчество: ");
        String patronymic = in.nextLine();

        System.out.printf("Привет %s %s %s \n", surname, name, patronymic);
        in.close();
    }
}
