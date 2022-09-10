package com.prodemy.util;

public class StringUtil {
    public static String pad(String bilangan, int panjang) {
        String result = " ";
        for (int i = 0; i < panjang; i++) result+= " ";
        result += bilangan;
        result = result.substring(result.length() - panjang);
        return result;
    }

    public static String pad(int bilangan, int panjang) {
        String result = " ";
        for (int i = 0; i < panjang; i++) result+= " ";
        result += bilangan;
        result = result.substring(result.length() - panjang);
        return result;
    }
}
