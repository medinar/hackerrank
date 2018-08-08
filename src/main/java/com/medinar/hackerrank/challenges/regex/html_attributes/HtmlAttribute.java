package com.medinar.hackerrank.challenges.regex.html_attributes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/html-attributes/problem?h_r=next-challenge&h_v=legacy
 *
 * @author Rommel Medina
 */
public class HtmlAttribute {

    // [<]([\w]+)([\s]?([\w]+)[=]?["][\w\d\/\.:-]*["])*[>]?
//<p><a href="http://www.quackit.com/html/tutorial/html_links.cfm" title="ats">Example Link</a></p>
//<div class="more-info"><a href="http://www.quackit.com/html/examples/html_links_examples.cfm" pop="">More Link Examples...</a></div>
    static final Pattern PATTERN = Pattern.compile("([<]([\\w]+))?([\\s]?([\\w]+)[\\s]?[=])*");

    public void detect(String input) {
        Matcher m = PATTERN.matcher(input);
        List<String> tags = new ArrayList<>();
        StringBuilder sb = new StringBuilder(input.length());
        while (m.find()) {
            if (!m.group().isEmpty()) {
                if (null != m.group(2) && null == m.group(4)) {
                    tags.add(m.group(2) + ":");
                }
                else if (null != m.group(2) && null != m.group(4)) {
                    sb.append(m.group(2)).append(":").append(m.group(4));
                }
                else if (null == m.group(2) && null != m.group(4)) {
                    sb.append(",").append(m.group(4));
                }
            }
        }
        tags.add(sb.toString());
//        Collections.sort(tags);
        tags.stream().forEach(tag -> System.out.println(tag));
    }

}
