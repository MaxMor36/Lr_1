package Lr_1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example_12 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи возраст: ");
        int age = in.nextInt();
        int year = LocalDate.now().getYear();
        int b_year = year - age;

        System.out.printf("Твой год рождения: " + b_year);
        in.close();
    }
}
