package com.medinar.hackerrank.challenges.regex.phone_numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rommel Medina
 */
public class PhoneNumber {

    public static final String PHONE_RGX = "^([0-9]{1,3})[ -]([0-9]{1,3})[ -]([0-9]{4,10})$";

    public String split(String input) {
        String splitted = "";
        Pattern pattern = Pattern.compile(PHONE_RGX);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.printf("CountryCode=%s,LocalAreaCode=%s,Number=%s\n",
                              matcher.group(1),
                              matcher.group(2),
                              matcher.group(3)
            );
        }
        return splitted;
    }

}
