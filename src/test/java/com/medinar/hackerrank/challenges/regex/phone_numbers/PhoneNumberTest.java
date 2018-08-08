package com.medinar.hackerrank.challenges.regex.phone_numbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rommel D. Medina
 */
public class PhoneNumberTest {

    public PhoneNumberTest() {
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
     * Test of split method, of class PhoneNumber.
     */
    @Test
    public void testSplit() {
        System.out.println("split");
//        String[] inArr = new String[]{"1 877 2638277", "91-011-23413627"};
        String[] inArr = new String[]{
            "148-809-2561957985",
            "188-547-5864327428",
            "891-454-9195497623",
            "648-42-380306686",
            "824-417-6460145493",
            "489-16-9839392781"
        };
        PhoneNumber instance = new PhoneNumber();
        String expResult = "";
//        String result = instance.split(input);
        for (String in : inArr) {
            instance.split(in);
        }
//        assertEquals(expResult, result);
    }

}
