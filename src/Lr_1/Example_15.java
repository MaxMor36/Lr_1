package Lr_1;

import java.util.Scanner;

public class Example_15 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи число A: ");
        int A = in.nextInt();
        System.out.println("Введи число B: ");
        int B = in.nextInt();
        int summ = A + B;
        int minus;

        if (A < B) {
            int max = B;
            int min = A;
            minus = max - min;
        } else {
            int max = A;
            int min = B;
            minus = max - min;
        }

        System.out.printf("Сумма: %d \nРазность: %d \n", summ, minus);
        in.close();
    }
}
