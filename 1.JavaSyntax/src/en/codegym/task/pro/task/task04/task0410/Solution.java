package en.codegym.task.pro.task.task04.task0410;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;
        while(true) {
            System.out.print("Enter a number: ");
            try {
                userNum = scanner.nextInt();
            } catch(InputMismatchException e) {
                break;
            }
            if(userNum == smallestNum) {
                break;
            } else if(userNum == secondSmallestNum) {
                break;
            } else if(userNum < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = userNum;
            } else if(userNum < secondSmallestNum) {
                secondSmallestNum = userNum;
            }
        } // close while
        System.out.println("Smallest: " + smallestNum);
        System.out.println("Second Smallest: " + secondSmallestNum);
    } // close main
} // close class
