package com.medinar.hackerrank.challenges.regex.html_attributes;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rommel D. Medina
 */
public class HtmlAttributeTest {

    public HtmlAttributeTest() {
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
     * Test of detect method, of class HtmlAttribute.
     */
    @Test
    public void testDetect() {
        System.out.println("detect");
        List<String> inputs = new ArrayList<>();
        inputs.add("<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>");
        inputs.add("<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>        ");
        HtmlAttribute instance = new HtmlAttribute();
        inputs.stream().forEach(input -> instance.detect(input));
    }

}
