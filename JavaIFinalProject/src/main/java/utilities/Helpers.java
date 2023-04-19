package utilities;

import model.Book;
import model.BookDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] options) {
        // For loop to print all of the options
        // substitue 7 with array.length + 1
        int choice = UserInput.getInt(scanner, "Choose an option 1-" + (options.length + 1), 1, options.length + 1);
        return choice;
    }
    
    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }
    
    public static void printArray(ArrayList<Book> books) {
        for(Book book: books) {
            System.out.println(book);
//            System.out.println("Title: " + book.getTitle());
//            System.out.println("Number of Pages: " + book.getNumPages());
//            System.out.println("Publication Date: " + book.getPublicationDate());
//            System.out.println("NYT Best Seller: " + book.isNewYorkTimesBestSeller());
//            System.out.println("Retail Price: " + book.getPriceInDollars());
//            System.out.println();
        }
    }
}
