package Lr_1;

import java.util.Scanner;

public class Example_9 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи месяц: ");
        String month = in.nextLine();
        System.out.println("Введи колличество дней в месяце: ");
        int day = in.nextInt();

        System.out.printf("В месяце %s содержится %d дней \n", month, day);
        in.close();
    }
}
