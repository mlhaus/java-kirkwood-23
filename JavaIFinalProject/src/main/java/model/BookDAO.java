package model;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.text.WordUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookDAO {
    private static ArrayList<Book> books;

    public static void retrieveData() {
        if(books == null) {
            try (Scanner scanner = new Scanner(new File("JavaIFinalProject\\src\\main\\resources\\books.txt"))) {
                books = new ArrayList<>();
                scanner.nextLine(); // read in the header row and don't do anything with it.
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split("\t");
                    Book book = new Book();
                    book.setTitle(WordUtils.capitalize(values[0].toLowerCase()));
                    book.setNumPages(Integer.parseInt(values[3]));
                    book.setPriceInDollars(Double.parseDouble(values[5]));
                    book.setNewYorkTimesBestSeller(Boolean.parseBoolean(values[4]));
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");
                    book.setPublicationDate(LocalDate.parse(values[2], format));
                    // set remaining values here
                    books.add(book);
                }
                Collections.sort(books);
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
