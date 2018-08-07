package com.medinar.hackerrank.challenges.java.scope;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rommel D. Medina
 */
public class DifferenceTest {
//    private static final ByteArrayOutputStream OUT_CONTENT = new ByteArrayOutputStream();
//    private final PrintStream originalOut = System.out;

    public DifferenceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
//        System.setOut(new PrintStream(OUT_CONTENT));
    }

    @After
    public void tearDown() {
//        System.setOut(originalOut);
    }

    /**
     * Test of computeDifference method, of class Difference.
     */
    @Test
    public void testComputeDifference() {
        System.out.println("computeDifference");
        // int expected = 4;
        // int[] elements = new int[]{1, 2, 5};
        int expected = 9;
        int[] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Difference difference = new Difference(elements);
        difference.computeDifference();

        int result = difference.maximumDifference;
        System.out.println(result);
//        assertEquals("4", OUT_CONTENT.toString());
        assertEquals(expected, result);
    }

}
