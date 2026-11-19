package Lr_1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example_10 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи год рождения: ");
        int b_year = in.nextInt();
        int year = LocalDate.now().getYear();
        int age = year - b_year;

        System.out.printf("Тебе: " + age);
        in.close();
    }
}
