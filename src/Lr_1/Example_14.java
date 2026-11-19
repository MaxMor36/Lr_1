package Lr_1;

import java.util.Scanner;

public class Example_14 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введи число: ");
        int nmb = in.nextInt();
        int nmb1 = nmb - 1;
        int nmb2 = nmb + 1;
        int sq_nmb = (nmb + nmb1 + nmb2) * (nmb + nmb1 + nmb2);

        System.out.printf("Числа: \n на 1 меньше: %d \n введенное: %d \n на 1 больше: %d \n корень суммы: %d \n", nmb1, nmb, nmb2, sq_nmb);
        in.close();
    }
}