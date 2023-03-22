import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    // write other methods here

    public static void main(String[] args) {
        // Only one user input Scanner allowed
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            main_program: while(true) {
                choice = UserInput.getInt(scanner, "Choose an option", 1, 7);
                switch(choice) {
                    case 1:
                        // Get all records
                        break;
                    case 2:
                        // Sort all records
                        break;
                    case 3:
                        // Get a single record
                        break;
                    case 4:
                        // Add a new record
//                        String title = UserInput.getString(scanner, "Enter the title");
//                        boolean isHardcover = UserInput.getBoolean(scanner, "Is this a hardcover book?");
//                        int numPages = UserInput.getInt(scanner, "How many pages?", 1);
//                        int temperature = UserInput.getInt(scanner, "What temperature is it today?");
                        LocalDate publicationDate = UserInput.getDate(scanner, "Enter the date of publication");
                        System.out.println("Month: " + publicationDate.getMonthValue());
                        System.out.println("Day of month: " + publicationDate.getDayOfMonth());
                        System.out.println("Year: " + publicationDate.getYear());
                        break;
                    case 5:
                        // Update a single record
                        break;
                    case 6:
                        // Delete a single record
                        break;
                    default:
                        // exit
                        break main_program;
                } // close of switch
            } // close of while
            System.out.println("Good bye!");
        } // close of Scanner
    } // close of main method

    // write other methods here

} // close of Main class