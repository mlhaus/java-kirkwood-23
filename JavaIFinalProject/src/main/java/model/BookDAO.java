package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    private static ArrayList<Book> books;

    public static void retrieveData() {
        if(books == null) {
            try (Scanner scanner = new Scanner(new File("JavaIFinalProject\\src\\main\\resources\\books.csv"))) {
                books = new ArrayList<>();
                scanner.nextLine(); // read in the header row and don't do anything with it.
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split(",");
                    Book book = new Book();
                    book.setTitle(values[0]);
                    // set remaining values here
                    books.add(book);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
