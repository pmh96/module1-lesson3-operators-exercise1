package com.example.operators.editHere;

public class OperatorLogic {
    public static void printOutput(int age, boolean isCitizen) {
        // Here you can edit the code!
        // ONLY replace /*<CONDITION HERE>*/ with the correct condition using logical operators
        // DO NOT edit the texts that will be printed out with System.out.println.
        // If you edit the texts, the tests and the assignment will fail!
        // 
        // How to solve this exercise:
        // You have to find the correct condition for the cases
        //  - You are allowed to drive, if you are at least 18 years old
        //  - You are allowed to vote, if you are a citizen of your country and at least 16 years old
        //  - Find the conditions that check, if you are allowed to do both or just one of the two things

        // NOTE: an IF statement takes a condition in the () round brackets to either execute a piece of code or not!
        // The code executed, if the condition is true, is enclosed in the {} curled brackets!

        if(/*<CONDITION HERE>*/){
            System.out.println("You are allowed to vote.");
        }
        if (/*<CONDITION HERE>*/) {
            System.out.println("You are allowed to drive.");
        } 
        if (/*<CONDITION HERE>*/) {
            System.out.println("You are not allowed to vote, but you are allowed to drive.");
        } 
        if (/*<CONDITION HERE>*/) {
            System.out.println("You are not allowed to drive, but you are allowed to vote.");
        } 
        if(/*<CONDITION HERE>*/){
            System.out.println("You are neither allowed to drive nor are you allowed to vote.");
        }
    }
}