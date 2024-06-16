package com.example.operators.editHere;

import com.example.operators.doNotEdit.TextsToPrint;

public class OperatorLogic {
    private TextsToPrint textsToPrint;

    public OperatorLogic(TextsToPrint textsToPrint) {
        this.textsToPrint = textsToPrint;
    }

    public void printOutput(int age, boolean isCitizen) {
        // Here you can edit the code!
        // ONLY replace /*<CONDITION HERE>*/ with the correct condition using logical
        // operators
        // DO NOT edit the texts that will be printed out with System.out.println.
        // If you edit the texts, the tests and the assignment will fail!
        //
        // How to solve this exercise:
        // You have to find the correct condition for the cases
        // - You are allowed to drive, if you are at least 18 years old
        // - You are allowed to vote, if you are a citizen of your country and at least
        // 16 years old
        // - Find the conditions that check, if you are allowed to do both or just one
        // of the two things

        // NOTE: an IF statement takes a condition in the () round brackets to either
        // execute a piece of code or not!
        // The code executed, if the condition is true, is enclosed in the {} curled
        // brackets!

        // Check if allowed to vote (citizen and at least 16 years old)
        if (isCitizen && age >= 16) {
            System.out.println(textsToPrint.getTextForAllowedToVote());
        }

        // Check if allowed to drive (at least 18 years old)
        if (age >= 18) {
            System.out.println(textsToPrint.getTextForAllowedToDrive());
        }

        // Check if allowed to drive BUT not vote (18+ years old, not a citizen)
        if (age >= 18 && !isCitizen) {
            System.out.println(textsToPrint.getTextForAllowedToDriveButNotVote());
        }

        // Check if allowed to vote BUT not drive (citizen, 16-17 years old)
        if (isCitizen && age >= 16 && age < 18) {
            System.out.println(textsToPrint.getTextForAllowedToVoteButNotDrive());
        }

        // Check if not allowed to do either (not a citizen, under 16)
        if (age < 16 || (age < 18 && !isCitizen)) {
            System.out.println(textsToPrint.getTextForAllowedToDoNothing());
        }
    }
}