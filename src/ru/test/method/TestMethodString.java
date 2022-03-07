package ru.test.method;

import java.util.Arrays;

public class TestMethodString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.contains(" "));
        System.out.println(str.equalsIgnoreCase("hElLo wOrLd"));
        System.out.println(str.indexOf('l'));
        System.out.println(str.replace('o','O'));
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf('l', i) > 0) {
                System.out.print(str.indexOf('l', i) + " ");
                i = str.indexOf('l', i);
            }
                   }
        System.out.println("");
            System.out.println(str.indexOf("oo"));
        System.out.println(str.substring(6));
        System.out.println(str.substring(3, 8));
        System.out.println(str.substring(0, 6));
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println("*".repeat(20));
    }
}
