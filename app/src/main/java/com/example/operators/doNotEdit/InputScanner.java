package com.example.operators.doNotEdit;

import java.util.Scanner;

public class InputScanner {
    public InputPojo scanForInput() {
        InputPojo input = new InputPojo();
        int age = -1;
        boolean isCitizen = false;

        try (Scanner scanner = new Scanner(System.in)) {

            try {

                System.out.print("Enter your age: ");
                age = scanner.nextInt();
            } catch (Exception e) {
                age = -1;
            }
            input.setAge(age);

            System.out.print("Are you a citizen? (yes/no): ");
            String nextLine = scanner.next();
            if (!nextLine.equalsIgnoreCase("yes") && !nextLine.equalsIgnoreCase("no")) {
                isCitizen = false;
            }
            isCitizen = nextLine.equalsIgnoreCase("yes");
            input.setCitizen(isCitizen);
        }

        return input;
    }
}
