package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String string = "taco cat";
        System.out.println("The string " + string + " is a palindrome permutation: " + palindromePermutation(string));
    }

    public static boolean palindromePermutation(String string){
        char[] contents = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>(contents.length);
        for (char c: contents){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int countDoubles = 0;
        for(int freq: map.values()){
            if (freq >= 2){
                countDoubles ++;
            }
        }
        if ((countDoubles + 2) >= map.size()){
            return true;
        }else{
            return false;
        }
    }
}