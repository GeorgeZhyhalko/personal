package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "Mr George Zhyhalko";
        System.out.println(urlify(string));

    }

    /*
    Replace every space in the given string with '%20'
    It's done by
    1. adding 2x number of spaces at the end of the array
    2. going back and replacing spaces with '%20' and copying other characters forward
     */
    public static String urlify(String string){
        char[] contents = string.toCharArray();
        int count = countOfChar(contents, 0, contents.length, ' ');
        char[] contentsExpanded = Arrays.copyOf(contents, contents.length + count+2);
        int newIndex = contentsExpanded.length-1;
        for(int oldIndex = contents.length-1; oldIndex >= 0; oldIndex-=1){
            if (contentsExpanded[oldIndex] == ' '){
                contentsExpanded[newIndex-2] = '%';
                contentsExpanded[newIndex-1] = '2';
                contentsExpanded[newIndex] = '0';
                newIndex -= 3;
            }else{
                contentsExpanded[newIndex] = contentsExpanded[oldIndex];
                newIndex--;
            }
        }
        return new String(contentsExpanded);
    }

    public static int countOfChar(char[] str, int start, int end, int target){
        int count = 0;
        for (int i = start; i < end; i++){
            if (str[i] == target){
                count ++;
            }
        }
        return count;
    }
}