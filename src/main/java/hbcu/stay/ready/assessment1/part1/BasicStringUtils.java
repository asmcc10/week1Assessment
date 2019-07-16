package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] words = str.split(" ");


        String newString = "";
        for(int i = 0; i <= words.length-1;i++){
            newString = words[i].substring(0,1).toUpperCase() + words[i].substring(1) + "";
        }

        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String reversedString = "";
        for(int i=str.length()-1; i >= 0; i--){
            reversedString = reversedString + str.charAt(i);
        }

        return reversedString;
        }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */

    public static String reverseWords(String str) {

        String[] array = str.split(" ");

        String reversedString = "";
        for(int x = 0; x < array.length; x++){
            String word = " " + array[x];
            for(int i=word.length()-1; i >= 0; i--){
                reversedString = reversedString + word.charAt(i);
        }
        }

        return reversedString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */

    public static String reverseThenCamelCase(String str) {
        String[] array = str.split(" ");

        String reversedString = "";
        for(int x = 0; x < array.length; x++){
            String word = " " + array[x];
            for(int i=word.length()-1; i >= 0; i--){
                reversedString = reversedString + word.charAt(i);
            }
        }


        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */

    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder deleteChar = new StringBuilder(str);

        deleteChar.deleteCharAt(0);
        deleteChar.deleteCharAt(str.length()-1);

        return deleteChar.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */

    public static String invertCasing(String str) {

        return null;
    }

}
