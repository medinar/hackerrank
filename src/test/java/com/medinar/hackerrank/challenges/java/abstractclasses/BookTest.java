package com.medinar.hackerrank.challenges.java.abstractclasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rommel D. Medina
 */
public class BookTest {

    public BookTest() {
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
     * Test of display method, of class Book.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Book book = new MyBook("The Alchemist", "Paulo Coelho", 248);
        book.display();
    }

}
