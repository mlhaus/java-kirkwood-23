package tasks;

import model.Book;
import model.BookDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Search implements TaskHandler {
    @Override
    public void handleTask(Scanner scanner) {
        while(true) {
            String titleSearch = UserInput.getString(scanner, "Search by title [~ to exit]");
            if(titleSearch.equals("~")) {
                break;
            }
            // Example 1 : Linear Search
//            ArrayList<Book> books = BookDAO.getBooks();
//            ArrayList<Book> filteredBooks = new ArrayList<>();
//            for(Book book: books) {
//                if(book.getTitle().toLowerCase().contains(titleSearch.toLowerCase())) {
//                    filteredBooks.add(book);
//                }
//            }
            // Example 2 : Declarative approach
            ArrayList<Book> filteredBooks = new ArrayList<>(BookDAO.getBooks());
            filteredBooks.removeIf((book) -> !book.getTitle().toLowerCase().contains(titleSearch.toLowerCase()));
            if(filteredBooks.size() >= 1) {
                Helpers.printArray(filteredBooks);
            } else {
                System.out.println("We couldn't find any books containing '" + titleSearch + "'.");
            }
            Helpers.pressEnterToContinue(scanner);
        }
    }
}
