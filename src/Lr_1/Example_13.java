package Lr_1;

import java.util.Scanner;

public class Example_13 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи число A: ");
        int A = in.nextInt();
        System.out.println("Введи число B: ");
        int B = in.nextInt();
        int summ = A + B;

        System.out.printf("Сумма чисел A и B: " + summ);
        in.close();
    }
}
