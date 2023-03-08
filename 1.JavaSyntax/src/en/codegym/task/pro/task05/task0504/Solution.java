/*
Combining arrays
*/

import java.util.Arrays;

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4};
    public static int[] secondArray = new int[]{5, 6, 7, 8};
    public static int[] resultArray;

    public static void main(String[] args) {
        //write your code here
        resultArray = new int[firstArray.length + secondArray.length];
        for(int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for(int i = 0; i < secondArray.length; i++) {
            resultArray[firstArray.length + i] = secondArray[i];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ((i == resultArray.length - 1) ? "" : ", "));
        }
        System.out.println();
        System.out.println(Arrays.toString(resultArray));
    }
}
