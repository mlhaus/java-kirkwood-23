package model;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.text.WordUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookDAO {
    private static ArrayList<Book> books;
    private static String filePath = new File("").getAbsolutePath() + "\\JavaIFinalProject\\src\\main\\resources\\books.txt";
    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");

    public static void retrieveData() {
        if(books == null) {
            try (Scanner scanner = new Scanner(new File(filePath))) {
                books = new ArrayList<>();
                scanner.nextLine(); // read in the header row and don't do anything with it.
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split("\t");
                    Book book = new Book();
                    book.setTitle(WordUtils.capitalize(values[0].toLowerCase()));
                    book.setNumPages(Integer.parseInt(values[2]));
                    book.setPriceInDollars(Double.parseDouble(values[4]));
                    book.setNewYorkTimesBestSeller(Boolean.parseBoolean(values[3]));
                    book.setPublicationDate(LocalDate.parse(values[1], dateFormat));
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

    private static void writeData() {
        try(PrintWriter writer = new PrintWriter(new File(filePath))) {
            writer.println("title\tpublication_date\tnum_pages\tnytimes_best_seller\tlist_price"); // use \t for tsv
//            writer.println("title,publication_date,num_pages,nytimes_best_seller,list_price"); // use commas for csv
            for(Book book : books) {
                writer.printf("%s\t%s\t%s\t%s\t%s\n",
                        book.getTitle().toUpperCase(),
                        book.getPublicationDate().format(dateFormat),
                        book.getNumPages(),
                        String.valueOf(book.isNewYorkTimesBestSeller()).toUpperCase(),
                        book.getPriceInDollars());
            }
        } catch(FileNotFoundException e) {
            System.out.println("The write data function could not be processed");
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        // add to the array
        books.add(book);
        // update the CSV file
        writeData();
    }


}
