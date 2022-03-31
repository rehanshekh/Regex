package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("^[a-cA-z]+[_+.\\-]?[a-zA-Z0-9]+@[a-zA-z0-9]+\\.[a-z]+[.]?[a-z]{2,3}$");
        Matcher m = p.matcher("abc+100@gmail.com");
        while (m.find()) {
            count++;
            System.out.println(m.group());
        }
        System.out.println(count);
    }
}
