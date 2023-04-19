package tasks;

import model.Book;
import model.BookDAO;
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
        
        Book book = new Book();
        book.setTitle(title);
        book.setPublicationDate(publicationDate);
        book.setNumPages(numPages);
        book.setNewYorkTimesBestSeller(nytimesBestseller);
        // set the double on your own

        BookDAO.addBook(book);
    }
}
