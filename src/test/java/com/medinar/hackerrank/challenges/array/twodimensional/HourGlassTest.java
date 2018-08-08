package com.medinar.hackerrank.challenges.array.twodimensional;

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
public class HourGlassTest {

    public HourGlassTest() {
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
     * Test of getMaxHourGlass method, of class HourGlass.
     */
    @Test
    public void testGetMaxHourGlass() {
        System.out.println("getMaxHourGlass");
        int[][] arr = new int[6][6];
        arr[0][0] = 1;
        arr[1][0] = 0;
        arr[2][0] = 1;
        arr[3][0] = 0;
        arr[4][0] = 0;
        arr[5][0] = 0;
        arr[0][1] = 1;
        arr[1][1] = 1;
        arr[2][1] = 1;
        arr[3][1] = 0;
        arr[4][1] = 0;
        arr[5][1] = 0;
        arr[0][2] = 1;
        arr[1][2] = 0;
        arr[2][2] = 1;
        arr[3][2] = 2;
        arr[4][2] = 0;
        arr[5][2] = 1;
        arr[0][3] = 0;
        arr[1][3] = 0;
        arr[2][3] = 0;
        arr[3][3] = 4;
        arr[4][3] = 2;
        arr[5][3] = 2;
        arr[0][4] = 0;
        arr[1][4] = 0;
        arr[2][4] = 0;
        arr[3][4] = 4;
        arr[4][4] = 0;
        arr[5][4] = 4;
        arr[0][5] = 0;
        arr[1][5] = 0;
        arr[2][5] = 0;
        arr[3][5] = 0;
        arr[4][5] = 0;
        arr[5][5] = 0;

        HourGlass instance = new HourGlass();
        int expResult = 19;
        int result = instance.getMaxHourGlass(arr);
        assertEquals(expResult, result);
    }

}
