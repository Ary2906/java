package org.internship.statements;



public class IfElseDemo {

    public String checkExamResult(int score) {
        if (score >= 90) {
            return "Grade A";
        } else if (score >= 75) {
            return "Grade B";
        } else if (score >= 50) {
            return "Grade C";
        } else {
            return "Fail";
        }
    }

    public boolean canVote(int age, boolean isCitizen) {
        if (age >= 18 && isCitizen) {
            return true;
        } else {
            return false;
        }
    }
}