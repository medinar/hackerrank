package com.medinar.hackerrank.challenges.regex.html_attributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/html-attributes/problem?h_r=next-challenge&h_v=legacy
 *
 * @author Rommel Medina
 */
public class HtmlAttribute {

    static final Pattern TAGS_PATTERN = Pattern.compile("[<]([\\w]+)([\\s]?[\\w]+[\\s]?[=][\\s]?[\"'\\w\\d\\s\\/\\.:\\-=\\[\\]\\?;&]*)?[>]");
    static final Pattern ATTRS_PATTERN = Pattern.compile("([\\w]+)[\\s]?[=][\\s]?[\"']");

    public void detect(List<String> inputs) {
        List<String> lines = new ArrayList<>();
        inputs.stream().forEach(input -> {
            Matcher m = TAGS_PATTERN.matcher(input);
            while (m.find()) {
                String tag = m.group(1) + ":";
                String attr = m.group(2);
                if (null != attr) {
                    Matcher mAttr = ATTRS_PATTERN.matcher(attr);
                    String attrs = "";
                    while (mAttr.find()) {
                        if (attrs.isEmpty()) {
                            attrs = attrs + mAttr.group(1);
                        }
                        else {
                            attrs = attrs + "," + mAttr.group(1);
                        }
                    }
                    tag = tag + attrs;
                }
                lines.add(tag);
            }
        });
        Collections.sort(lines);
        lines.stream().distinct().forEach(s -> System.out.println(s));
    }

}
