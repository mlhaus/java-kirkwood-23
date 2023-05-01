package finalReview;

import java.util.Arrays;

class Helpers {
    // Define a method that takes an array of strings and two integers (representing
    // array indexes). Write an if statement to check if the two numbers are between
    // 0 and the length of the array. If true, swap the elements at the given indexes
    protected static void swap(String[] arr, int index1, int index2) {
        if(index1 >= 0 && index2 >= 0 && index1 < arr.length && index2 < arr.length) {
            // swap values
            String temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        String[] programmingLanguages = {"Python", "PHP", "Java", "JavaScript"};
        // Call the method to swap Python and Java
        Helpers.swap(programmingLanguages, 0, 2);
        System.out.println(Arrays.toString(programmingLanguages));
    }
}

