package en.codegym.task.pro.task05.task0502;

/*
Even and odd cells of an array
*/

public class Solution {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[10];

    public static void main(String[] args) {
        //write your code here
        for(int i = 0; i < strings.length; i++) {
            if(i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }

        for(int i = 0; i < strings.length; i++) {
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
        }

    }
}
