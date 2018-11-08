package com.company;

import java.util.Scanner;

public class Task2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int r, m;

        System.out.println("Введите числа r и m такие, что r ≤ m");
        do {
            r = promptInt("Введите число r");
            m = promptInt("Введите число m");

            if (!(r <= m)) {
                System.out.println("Не выполнено условие: r ≤ m");
            }
        } while (!(r <= m));


        int result = (m * m) * (r * r) * (m - r) * (m - r);

        System.out.println("Результат выполнения функции: " + result);
    }


    private static int promptInt(String promptString) {
        System.out.println(promptString);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Пожалуйста, введите число.");
            return promptInt(promptString);
        }
    }
}
