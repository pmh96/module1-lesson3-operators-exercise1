package com.example.operators.doNotEdit;

public class TextsToPrint {
    public String getTextForAllowedToVote() {
        return "You are allowed to vote.";
    }

    public String getTextForAllowedToDrive() {
        return "You are allowed to drive.";
    }

    public String getTextForAllowedToVoteButNotDrive() {
        return "You are not allowed to vote, but you are allowed to drive.";
    }

    public String getTextForAllowedToDriveButNotVote() {
        return "You are not allowed to drive, but you are allowed to vote.";
    }

    public String getTextForAllowedToDoNothing() {
        return "You are neither allowed to drive nor are you allowed to vote.";
    }
}