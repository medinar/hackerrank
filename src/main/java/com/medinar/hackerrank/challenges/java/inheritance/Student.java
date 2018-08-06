package com.medinar.hackerrank.challenges.java.inheritance;

/**
 *
 * @author Rommel Medina
 */
public class Student extends Person {

    private final int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        char grade = 0;
        int scoreSum = 0;
        int ave = 0;
        for (int testScore : testScores) {
            scoreSum = scoreSum + testScore;
        }
        ave = scoreSum / testScores.length;
        if (ave >= 90 && ave <= 100) {
            grade = 'O';
        }
        else if (ave >= 80 && ave <= 90) {
            grade = 'E';
        }
        else if (ave >= 70 && ave <= 80) {
            grade = 'A';
        }
        else if (ave >= 55 && ave <= 70) {
            grade = 'P';
        }
        else if (ave >= 40 && ave <= 55) {
            grade = 'D';
        }
        else if (ave < 40) {
            grade = 'T';
        }
        return grade;
    }

}
