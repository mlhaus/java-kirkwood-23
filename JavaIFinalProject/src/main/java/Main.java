import model.Book;
import model.BookDAO;
import tasks.Add;
import tasks.Search;
import tasks.Sort;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    // write other methods here

    public static void main(String[] args) {
        BookDAO.retrieveData();
        // Only one user input Scanner allowed
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            String[] options = {
                    "Get all books",
                    "Sort books",
                    "Search books",
                    "Add a book",
                    "Update a book",
                    "Delete a book"
            };
            main_program: while(true) {
                System.out.println("\n** MAIN MENU **");
                choice = Helpers.getChoice(scanner, options);
                switch(choice) {
                    case 1:
                        // Get all records
                        Helpers.printArray(BookDAO.getBooks());
                        break;
                    case 2:
                        new Sort().handleTask(scanner);
                        break;
                    case 3:
                        new Search().handleTask(scanner);
                        break;
                    case 4:
                        new Add().handleTask(scanner);
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
                Helpers.pressEnterToContinue(scanner);
            } // close of while
            System.out.println("Good bye!");
        } // close of Scanner
    } // close of main method

    // write other methods here

} // close of Main class