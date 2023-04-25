package utilities;

import model.Book;
import model.BookDAO;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        System.out.println(Book.getHeaderRow());
        for(Book book: books) {
            System.out.println(book);
        }
    }
    
    public static String formatDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = date.format(format);
        return formattedDate;
    }
    
    public static String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        return "$" + formatter.format(amount);
    }
}
