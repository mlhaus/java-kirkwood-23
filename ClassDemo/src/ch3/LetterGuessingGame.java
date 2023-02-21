package ch3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LetterGuessingGame {
    public static char randomLetter() {
        int min = 65;
        int max = 90;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return (char)randomNum;
    }

    public static void main(String[] args) {
        char guess = '?', answer = randomLetter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a letter: ");
        while(true) {
            guess = scanner.nextLine().charAt(0);
            boolean guessIsLowerCase = guess >= 97 && guess <= 122;
            if(guessIsLowerCase) {
                guess -= 32;
            }
            if(guess == answer) {
                System.out.println("Correct!");
                break;
            } else {
                if(!(guess >= 65 && guess <= 90)) {
                    System.out.print("Invalid letter. Guess again: ");
                } else if(guess > answer) {
                    System.out.print("Incorrect. Guess lower: ");
                } else {
                    System.out.print("Incorrect. Guess higher: ");
                }
            }
        }



        
    }
}
