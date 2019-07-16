package hbcu.stay.ready.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        return sentence.split(" ");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

       String[] words = sentence.split(" ");

        return words[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] words = sentence.split(" ");

        String firstWord = words[0];
        String reversedFirstWord = "";

        for(int i=firstWord.length()-1; i >= 0; i--){
            reversedFirstWord = reversedFirstWord + firstWord.charAt(i);
        }

        String newString = reversedFirstWord + " " + words[1];

        return newString;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] words = sentence.split(" ");

        String firstWord = words[0];
        String reversedFirstWord = "";

        for(int i=firstWord.length()-1; i >= 0; i--){
            reversedFirstWord = reversedFirstWord + firstWord.charAt(i);
        }

        String changedFirstWord = reversedFirstWord.substring(0,1) + reversedFirstWord.substring(1,firstWord.length()).toLowerCase();
        String newString = changedFirstWord + words[1].substring(0,1).toUpperCase() + words[1].substring(1);
        String finalString = newString.substring(0,1).toUpperCase() + newString.substring(1);

        return finalString;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        StringBuilder delete = new StringBuilder(str);

        delete.deleteCharAt(index);

        return delete.toString();
    }

}
