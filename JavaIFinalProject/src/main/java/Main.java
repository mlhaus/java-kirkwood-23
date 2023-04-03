import model.Book;
import model.BookDAO;
import utilities.UserInput;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    // write other methods here

    public static void main(String[] args) {
        BookDAO.retrieveData();
        // Only one user input Scanner allowed
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            main_program: while(true) {
                choice = UserInput.getInt(scanner, "Choose an option", 1, 7);
                switch(choice) {
                    case 1:
                        // Get all records
                        for(Book book: BookDAO.getBooks()) {
                            System.out.println(book.getTitle());
                        }
                        break;
                    case 2:
                        // Sort all records
                        break;
                    case 3:
                        // Get a single record
                        break;
                    case 4:
                        // Add a new record
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