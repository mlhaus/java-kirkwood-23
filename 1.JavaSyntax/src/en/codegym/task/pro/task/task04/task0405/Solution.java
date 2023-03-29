package en.codegym.task.pro.task.task04.task0405;

/*
Unfilled rectangle

Using nested while loops (a loop within a loop), display an
unfilled rectangle (just an outline) that is 10 (height)
by 20 (width) and made from the letter 'B'.
The unfilled part consists of spaces.

Example output:
BBBBBBBBBBBBBBBBBBBB
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
BBBBBBBBBBBBBBBBBBBB
*/

public class Solution {
    static int height = 10;
    static int width = 20;

    public static void main(String[] args) {
        int i = 0;
        while(i < height) {
            int j = 0;
            while(j < width) {
                if(i == 0 || i == height - 1) {
                    System.out.print("B");
                } else {
                    if(j == 0 || j == width - 1) {
                        System.out.print("B");
                    }else {
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}