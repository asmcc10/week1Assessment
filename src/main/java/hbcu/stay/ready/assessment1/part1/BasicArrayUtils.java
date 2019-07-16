package hbcu.stay.ready.assessment1.part1;


/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String[] string = stringArray;

        return string[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        String[] statement = stringArray;

        return statement[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {

        String[] input = stringArray;

        String[] reversedArray = new String[input.length];
        int reverseArrayIndex = 0;
        for(int i=input.length-1; i >= 0; i--){
            reversedArray[reverseArrayIndex] = input[i];
            reverseArrayIndex++;
        }

        return reversedArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String[] startArray = stringArray;

        String createdString = "";
        //first loop goes through the elements the second goes through the strings
        for(int i = 0; i < startArray.length; i++){
                createdString = createdString + startArray[i].charAt(0);
            }

        return createdString;
    }
}
