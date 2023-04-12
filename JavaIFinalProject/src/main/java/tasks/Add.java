package tasks;

import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Add implements TaskHandler {

    @Override
    public void handleTask(Scanner scanner) {
        String title = UserInput.getString(scanner, "Enter the book's title");
        LocalDate publicationDate = UserInput.getDate(scanner, "Enter the date of publication");
        int numPages = UserInput.getInt(scanner, "How many pages are there?", 0);
        // Final Project part 3 - Write getDouble methods in the UserInput class
        boolean nytimesBestseller = UserInput.getBoolean(scanner, "Is this a NY Times best seller?");
        // instantiate an object
        // add to the array
        // update the CSV file
    }
}
