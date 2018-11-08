package com.company;

import java.util.stream.IntStream;

public class Task1 {

    public static void run() {

        IntStream.range(1, 101)
                .mapToObj(i -> {
                    if (i % 2 == 0 && i % 7 == 0) {
                        return "TwoSeven";
                    } else if (i % 2 == 0) {
                        return "Two";
                    } else if (i % 7 == 0) {
                        return "Seven";
                    } else {
                        return String.valueOf(i);
                    }
                }).forEach(System.out::println);

    }


}
