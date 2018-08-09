package com.medinar.hackerrank.challenges.regex.html_attributes;

import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/html-attributes/problem?h_r=next-challenge&h_v=legacy
 *
 * @author Rommel Medina
 */
public class HtmlAttribute {

    static final Pattern TAGS_PATTERN = Pattern.compile("[<]([\\w]+)([\\s]?[\\w]+[\\s]?[=][\\s]?[\"'\\w\\d\\s\\/\\.,:\\-=\\[\\]\\?;&#]*)?[/>]*");
    static final Pattern ATTRS_PATTERN = Pattern.compile("([\\w]+)[\\s]?[=][\\s]?[\"']");

    public void detect(List<String> inputs) {
        SortedMap<String, SortedSet<String>> tagAttrMap = new TreeMap<>();
        inputs.stream().forEach(input -> {
            Matcher m = TAGS_PATTERN.matcher(input);
            while (m.find()) {
                String tag = m.group(1);
                String attr = m.group(2);
                if (!tagAttrMap.containsKey(tag)) {
                    tagAttrMap.put(tag, new TreeSet<>());
                }
                if (null != attr) {
                    Matcher mAttr = ATTRS_PATTERN.matcher(attr);
                    while (mAttr.find()) {
                        tagAttrMap.get(tag).add(mAttr.group(1));
                    }
                }

            }
        });

        tagAttrMap.forEach((tag, attribute) -> {
            StringBuilder sb = new StringBuilder(tag);
            sb.append(":")
                    .append(attribute.stream().collect(Collectors.joining(",")));
            System.out.println(sb.toString());
        });
    }

}
