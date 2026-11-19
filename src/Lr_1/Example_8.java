package Lr_1;

import java.util.Scanner;

public class Example_8 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи день недели: ");
        String day = in.nextLine();
        System.out.println("Введи месяц: ");
        String month = in.nextLine();
        System.out.println("Введи число: ");
        int d_month = in.nextInt();

        System.out.printf("Сегодня %s %d %s \n", day, d_month, month);
        in.close();
    }
}
