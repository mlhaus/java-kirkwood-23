package tasks;

import model.Book;
import model.BookDAO;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void handleTask(Scanner scanner) {
        int choice = 0;
        String[] options = {
                "Sort by title (A to Z)",
                "Sort by title (Z to A)",
                "Sort by publication date (old to new)",
                "Sort by publication date (new to old)",
                "Sort by number of pages (low to high)",
                "Sort by number of pages (high to low)",
                "Sort by price (low to high)",
                "Sort by price (high to low)"
        };
        sort_program: while(true) {
            System.out.println("\n** SORT MENU **");
            choice = Helpers.getChoice(scanner, options);
            ArrayList<Book> books = BookDAO.getBooks();
            switch(choice) {
                case 1:
                    // Sort title A-Z
                    
                    break;
                case 2:
                    // Sort title Z-A
                    
                    break;
                case 3:
                    // Sort date old-new
                    Collections.sort(books, (a, b) -> a.getPublicationDate().compareTo(b.getPublicationDate()));
                    break;
                case 4:
                    // Sort date new-old
                    Collections.sort(books, (a, b) -> a.getPublicationDate().compareTo(b.getPublicationDate()) * -1);
                    break;
                case 5:
                    // Sort pages 0-9
                    break;
                case 6:
                    // Sort pages 9-0
                    break;
                case 7:
                    // Sort price 0-9
                    break;
                case 8:
                    // Sort price 9-0
                    break;
                default:
                    // exit
                    break sort_program;
            } // close of switch
            Helpers.printArray(books);
            Helpers.pressEnterToContinue(scanner);
        } // close of while
    }
}
