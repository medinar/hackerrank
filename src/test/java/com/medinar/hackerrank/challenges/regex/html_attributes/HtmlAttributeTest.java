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
//        inputs.add("<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>");
//        inputs.add("<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>        ");
        inputs.add("<div class=\"portal\" role=\"navigation\" id='p-navigation'>");
        inputs.add("<h3>Navigation</h3>");
        inputs.add("<div class=\"body\">");
        inputs.add("<ul>");
        inputs.add("<li id=\"n-mainpage-description\"><a href=\"/wiki/Main_Page\" title=\"Visit the main page [z]\" accesskey=\"z\">Main page</a></li>");
        inputs.add("<li id=\"n-contents\"><a href=\"/wiki/Portal:Contents\" title=\"Guides to browsing Wikipedia\">Contents</a></li>");
        inputs.add("<li id=\"n-featuredcontent\"><a href=\"/wiki/Portal:Featured_content\" title=\"Featured content  the best of Wikipedia\">Featured content</a></li>");
        inputs.add("<li id=\"n-currentevents\"><a href=\"/wiki/Portal:Current_events\" title=\"Find background information on current events\">Current events</a></li>");
        inputs.add("<li id=\"n-randompage\"><a href=\"/wiki/Special:Random\" title=\"Load a random article [x]\" accesskey=\"x\">Random article</a></li>");
        inputs.add("<li id=\"n-sitesupport\"><a href=\"//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&amp;utm_medium=sidebar&amp;utm_campaign=C13_en.wikipedia.org&amp;uselang=en\" title=\"Support us\">Donate to Wikipedia</a></li>");
        inputs.add("</ul>");
        inputs.add("</div>");
        inputs.add("</div>");

        HtmlAttribute instance = new HtmlAttribute();
        instance.detect(inputs);
    }

}
