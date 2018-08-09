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
        // Test Case # 0
        // inputs.add("<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>");
        // inputs.add("<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>        ");

        // Test Case # 2
        // inputs.add("<div class=\"portal\" role=\"navigation\" id='p-navigation'>");
        // inputs.add("<h3>Navigation</h3>");
        // inputs.add("<div class=\"body\">");
        // inputs.add("<ul>");
        // inputs.add("<li id=\"n-mainpage-description\"><a href=\"/wiki/Main_Page\" title=\"Visit the main page [z]\" accesskey=\"z\">Main page</a></li>");
        // inputs.add("<li id=\"n-contents\"><a href=\"/wiki/Portal:Contents\" title=\"Guides to browsing Wikipedia\">Contents</a></li>");
        // inputs.add("<li id=\"n-featuredcontent\"><a href=\"/wiki/Portal:Featured_content\" title=\"Featured content  the best of Wikipedia\">Featured content</a></li>");
        // inputs.add("<li id=\"n-currentevents\"><a href=\"/wiki/Portal:Current_events\" title=\"Find background information on current events\">Current events</a></li>");
        // inputs.add("<li id=\"n-randompage\"><a href=\"/wiki/Special:Random\" title=\"Load a random article [x]\" accesskey=\"x\">Random article</a></li>");
        // inputs.add("<li id=\"n-sitesupport\"><a href=\"//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&amp;utm_medium=sidebar&amp;utm_campaign=C13_en.wikipedia.org&amp;uselang=en\" title=\"Support us\">Donate to Wikipedia</a></li>");
        // inputs.add("</ul>");
        // inputs.add("</div>");
        // inputs.add("</div>");
        // Test Case # 3
        inputs.add("<center>");
        inputs.add("<div class=\"noresize\" style=\"height: 242px; width: 600px; \"><map name=\"ImageMap_1_971996215\" id=\"ImageMap_1_971996215\">");
        inputs.add("<area href=\"/wiki/File:Pardalotus_punctatus_female_with_nesting_material_-_Risdon_Brook.jpg\" shape=\"rect\" coords=\"3,3,297,238\" alt=\"Female\" title=\"Female\" />");
        inputs.add("<area href=\"/wiki/File:Pardalotus_punctatus_male_with_nesting_material_-_Risdon_Brook.jpg\" shape=\"rect\" coords=\"302,2,597,238\" alt=\"Male\" title=\"Male\" /></map><img alt=\"Pair of Spotted Pardalotes\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Female_and_male_Pardalotus_punctatus.jpg/600px-Female_and_male_Pardalotus_punctatus.jpg\" width=\"600\" height=\"242\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Female_and_male_Pardalotus_punctatus.jpg/900px-Female_and_male_Pardalotus_punctatus.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Female_and_male_Pardalotus_punctatus.jpg/1200px-Female_and_male_Pardalotus_punctatus.jpg 2x\" usemap=\"#ImageMap_1_971996215\" />");
        inputs.add("<div style=\"margin-left: 0px; margin-top: -20px; text-align: left;\"><a href=\"/wiki/File:Female_and_male_Pardalotus_punctatus.jpg\" title=\"About this image\"><img alt=\"About this image\" src=\"//bits.wikimedia.org/static-1.22wmf7/extensions/ImageMap/desc-20.png\" style=\"border: none;\" /></a></div>");
        inputs.add("</div>");
        inputs.add("</center>");

        HtmlAttribute instance = new HtmlAttribute();
        instance.detect(inputs);
    }

}
