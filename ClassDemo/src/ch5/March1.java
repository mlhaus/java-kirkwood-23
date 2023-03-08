package ch5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class March1 {
    public static int randomNumber(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }
    
    public static void main(String[] args) {
        // Differences between Java arrays and Python lists
        // Declare the data type with square brackets
        // The square brackets can be written after the data tpe or the variable name
        // Java arrays are fixed length
        // Arrays can be assigned values wrapped in curly brackets
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek[0]); // Sunday
        System.out.println(daysOfWeek[3]); // Wednesday
        System.out.println(daysOfWeek[daysOfWeek.length - 1]); // The last value, Saturday
        // For-each loop (enhanced for loop)
        // (DataType variableName: arrayName)
        for(String day: daysOfWeek) {
            System.out.println(day);
        }

        // Arrays can be declared using a fixed length of unknown values
        int lottoNumbers[] = new int[6];
        lottoNumbers[0] = randomNumber(1,70);
        lottoNumbers[1] = randomNumber(1,70);
        lottoNumbers[2] = randomNumber(1,70);
        lottoNumbers[3] = randomNumber(1,70);
        lottoNumbers[4] = randomNumber(1,70);
        lottoNumbers[5] = randomNumber(1,36);
        int[] first5Numbers = Arrays.copyOfRange(lottoNumbers,0, 5); // the to value must be 1 higher than needed
        Arrays.sort(first5Numbers); // This is a quick sort. Pages 140-141 talk about bubble sort
        System.out.print("Tonight's Lotto Numbers are: ");
        for(int i = 0; i <= 4; i++) {
            System.out.print(first5Numbers[i] + " ");
        }
        System.out.println("\nAnd the Powerball is: " + lottoNumbers[lottoNumbers.length - 1]);


    }
}
