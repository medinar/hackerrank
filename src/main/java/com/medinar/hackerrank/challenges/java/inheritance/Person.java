package com.medinar.hackerrank.challenges.java.inheritance;

/**
 *
 * @author Rommel Medina
 */
public class Person {
    String firstName;
    String lastName;
    int idNumber;

    public Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber
        );
    }

}
