package com.medinar.hackerrank.challenges.regex;

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
public class HackerLanguageTest {

    public HackerLanguageTest() {
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
     * Test of isValid method, of class HackerLanguage.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String language = "LUA";
        HackerLanguage instance = new HackerLanguage();
        boolean expResult = true;
        boolean result = instance.isValid(language);
        assertEquals(expResult, result);
    }

}
