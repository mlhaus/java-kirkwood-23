package en.codegym.task.pro.task.task06.task0605;

/*
Correct order
*/



import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(Integer[] array) {
        //write your code here
//        for(int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        ArrayUtils.reverse(array);
    }

    public static void printArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
