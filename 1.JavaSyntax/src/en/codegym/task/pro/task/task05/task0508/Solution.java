package en.codegym.task.pro.task.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/*
Remove duplicate strings
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for(int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        for(int i = 0; i < strings.length - 1; i++) {
            boolean duplicateFound = false;
            for(int j = i + 1; j < strings.length; j++) {
                if(strings[i] != null && strings[i].equals(strings[j])) {
                    duplicateFound = true;
                    strings[j] = null;
                }
            }
            if(duplicateFound) {
                strings[i] = null;
            }
        }
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + ", ");
//        }
        System.out.println(Arrays.toString(strings));
    }
}
