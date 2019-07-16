package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer[] inputArray = intArray;

        Integer sum = 0;
        for(int i=0; i < inputArray.length;i++){
            sum += inputArray[i];
        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer[] arrayOne = intArray;

        Integer prod = 1;
        for(int i=0; i < arrayOne.length; i++){
            prod *= arrayOne[i];
        }
        return prod;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer[] input = intArray;

        Double sum = 0.0;
        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }

        Double average = (sum / input.length);
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Integer[] start = intArray;

        Integer maxVal = start[0];
        for(int i =0; i<start.length; i++){
            if(maxVal <= start[i]){
                maxVal = start[i];
            }
        }
        return maxVal;
    }
}
