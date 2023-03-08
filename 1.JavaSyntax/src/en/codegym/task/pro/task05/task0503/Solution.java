package en.codegym.task.pro.task05.task0503;
/*
Working with elements of an array
*/

public class Solution {

    public static int[] array = new int[]{8,-1,9,2,-6,7};

    public static void main(String[] args) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                array[i] *= -1;
            }
        }
        for(int value: array) {
            System.out.println(value);
        }
    }
}
