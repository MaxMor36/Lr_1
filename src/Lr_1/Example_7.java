package Lr_1;

import java.util.Scanner;

public class Example_7 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи имя: ");
        String name = in.nextLine();
        System.out.println("Введи возраст: ");
        int age = in.nextInt();

        System.out.printf("Имя: %s  возраст: %d \n", name, age);
        in.close();
    }
}
