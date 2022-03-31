package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}[A-Z][a-z]{2,}[a-cA-z]+[_+.\\-]?[a-zA-Z0-9]+@[a-zA-z0-9]+\\.[a-z]+[.]?[a-z]{2,3}[0-9]{2}\\s[0-9][A-Za-z0-9]*[@!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.-]?[A-Za-z0-9]*$");
        Matcher m = p.matcher("RehanShaikhrehanshekh@gmail.com91 7738565536re@Ehan445");
        while (m.find()) {
            count++;
            System.out.println(m.group());
        }
        System.out.println(count);
    }
}
