package com.medinar.hackerrank.challenges.java.linkedlist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rommel D. Medina
 */
public class SolutionTest {

    public SolutionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class Solution.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Node head = null;
        int[] arrData = new int[]{2, 3, 4, 1};
        for (int data : arrData) {
            head = Solution.insert(head, data);
        }
        Solution.display(head);
//        assertEquals(expResult, result);
    }


}
