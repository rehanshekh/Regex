package com.blz;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {

    public static void main(String[] args) {
        int count=0;
        Pattern p= Pattern.compile("[4][0]{2}\\s?[08]{3}$");
        Matcher m = p.matcher("400 008");
        while(m.find()){
            count++;
            System.out.println(m.group());
        }
        System.out.println(count);
    }
}
