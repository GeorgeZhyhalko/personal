package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string1 = "abcdef";
        String string2 = "badcfe";
        String string3 = "zzz";

        System.out.println("Checking method 1");
        System.out.println("Strings " + string1 + " and " + string2 + " are permutations: " + checkPermutation(string1, string2));
        System.out.println("Strings " + string1 + " and " + string3 + " are permutations: " + checkPermutation(string1, string3));
        System.out.println("Checking method 2");
        System.out.println("Strings " + string1 + " and " + string2 + " are permutations: " + checkPermutation2(string1, string2));
        System.out.println("Strings " + string1 + " and " + string3 + " are permutations: " + checkPermutation2(string1, string3));
    }

    /*
    Check if one string is a permutation of another
    It's done by
    1. converting strings to arrays of characters,
    2. sorting and comparing arrays/strings
     */
    public static boolean checkPermutation(String string1, String string2){
        char[] charAr1 = string1.toCharArray();
        char[] charAr2 = string2.toCharArray();

        Arrays.sort(charAr1);
        Arrays.sort(charAr2);
        if (Arrays.equals(charAr1, charAr2)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkPermutation2(String string1, String string2){
        string1 = sort(string1);
        string2 = sort(string2);
        return string1.equals(string2);
    }

    public static String sort(String string){
        char[] contents = string.toCharArray();
        Arrays.sort(contents);
        return new String(contents);
    }
}