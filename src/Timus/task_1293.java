package Timus;

import java.util.Scanner;

public class task_1293 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N, A, B;

        do {
            System.out.println("Количество панелей: ");
            N = in.nextInt();
        } while (N < 1 || N > 100);
        do {
            System.out.println("Длина панели: ");
            A = in.nextInt();
        } while (A < 1 || A > 100);
        do {
            System.out.println("Ширина панели: ");
            B = in.nextInt();
        } while (B < 1 || B > 100);

        int print = N * (A * B * 2);

        System.out.printf("Необходимо сульфида тория в нанограммах: " + print);
    }
}
