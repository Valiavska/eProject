package com.company.string_demo;

import java.nio.charset.StandardCharsets;

public class MainString {

    public static void main(String[] args) {
        //  обьявили массив  "chars"
        char [] chars = {'a', 'b'};
        // create string from array using key word "new"
        String stringFromChars = new String(chars);
        System.out.println(stringFromChars);

        //  bytes array
        byte  [] bytes = {1, 2, 3, 4, 5};
        //  create string from array bytes, using character encoding
        String stringFromBytes = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println(stringFromBytes);

        //  create string through literals
        String s1 = "long string";
        String s2 = "Long string";
        //  compareToIgnoreCase - compare two string ignoring the register
        System.out.println(s1.compareToIgnoreCase(s2));

        //  matches the string "s1" with the pattern, "regex" - regular expression
        System.out.println(s1.matches("(.*)long(.*)"));

        //  displays the string UpperCase
        System.out.println(s1.toUpperCase());

        //  replace all symbols "o" on the "A"
        System.out.println(s1.replaceAll("o", "A"));

        //  create new object - "new StringBuffer". StringBuffer" - changeable
        StringBuffer stringBuffer = new StringBuffer(s2);
        //   before modification
        System.out.println(stringBuffer);
        stringBuffer.append("ggggg");
        //   after modification
        System.out.println(stringBuffer);

        //  method "contentEquals" that equals content string and object created with stringBuffer
        System.out.println(s2.contentEquals(stringBuffer));

    }
}
