import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String strUnique = "abcdef";
        String strNotUnique = "abcdeff";
        System.out.println("String " + strNotUnique + " is unique: " + isUniqueChars(strNotUnique));
        System.out.println("String " + strUnique + " is unique: " + isUniqueChars(strUnique));

    }
    /*
    Find if the string contains only unique characters
    It's done by
    1. converting string to char array
    2. adding characters to HashSet.
    3. if the element exists, return false
     */
    public static boolean isUniqueChars(String str){
        char[] charAr = str.toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        for (char indChar: charAr){
            if (charSet.contains(indChar)){
                return false;
            }
            charSet.add(indChar);
        }
        return true;
    }
}