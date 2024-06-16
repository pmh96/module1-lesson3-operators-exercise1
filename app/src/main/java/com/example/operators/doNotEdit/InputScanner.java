package com.example.operators.doNotEdit;

import java.util.Scanner;

public class InputScanner {
    public static int scanForAge() {
        int age = -1;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                try {
                    age = scanner.nextInt();
                } catch (Exception e) {
                    age = -1;
                }
            } while (age <= 0);
        }
        return age;
    }

    public static boolean scanForIsCitizen() {
        boolean isCitizen = false;
        boolean success = false;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                try {
                    isCitizen = scanner.nextBoolean();
                } catch (Exception e) {
                    success = false;
                }
            } while (!success);
        }
        return isCitizen;
    }
}
