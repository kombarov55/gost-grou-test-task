package com.company;

import java.util.*;

public class Task3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        String text = promptLine("Введите литературный текст");

        String[] words = text.split(" ");
        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            wordToCount.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }

        wordToCount.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .forEach(System.out::println);


    }

    private static String promptLine(String promptString) {
        System.out.println(promptString);

        return scanner.nextLine();
    }

}
