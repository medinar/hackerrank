package com.medinar.hackerrank.challenges.java.inheritance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rommel D. Medina
 */
public class StudentTest {

    private static final ByteArrayOutputStream OUT_CONTENT = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setOut(new PrintStream(OUT_CONTENT));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testSomeMethod() {
        int[] testScores = new int[]{100, 80};
        Student s = new Student("Heraldo", "Memelli", 8135627, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

}
