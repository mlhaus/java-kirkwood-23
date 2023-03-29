package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookDAO {
    public static void retrieveData() {
        try (Scanner scanner = new Scanner(new File("JavaIFinalProject\\src\\main\\resources\\books.csv"))) {
            System.out.println("I found it!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
