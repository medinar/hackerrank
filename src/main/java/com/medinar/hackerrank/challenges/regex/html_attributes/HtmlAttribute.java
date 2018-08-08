package com.medinar.hackerrank.challenges.regex.html_attributes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/html-attributes/problem?h_r=next-challenge&h_v=legacy
 *
 * @author Rommel Medina
 */
public class HtmlAttribute {

    static final Pattern PATTERN = Pattern.compile("([<]([\\w]+))?([\\s]?([\\w]+)[\\s]?[=])*");

    public void detect(String input) {
        Matcher m = PATTERN.matcher(input);
        String out = "";
        while (m.find()) {
            if (!m.group().isEmpty()) {
                if (!m.group(2).isEmpty() && null == m.group(4)) {
                    System.out.println(m.group(2) + ":");
                }
                else if (!m.group(2).isEmpty() && !m.group(4).isEmpty()) {
                    out = out + m.group(2) + ":" + m.group(4);
                }
                else if (null == m.group(2) && !m.group(4).isEmpty()) {
                    out = out + m.group(4);
                }
            }
        }
        if (!out.isEmpty()) {
            System.out.println(out);
        }
    }

}
