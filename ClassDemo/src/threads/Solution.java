package threads;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //write your code here
        int min = ints[0];
        for(int i = 1; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
