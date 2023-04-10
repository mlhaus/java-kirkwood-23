package model;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    private String title;
    private int numPages;
    private double priceInDollars;
    private boolean newYorkTimesBestSeller;
    private LocalDate publicationDate;
    private static int bookCount = 0;
    
    public Book() {
        title = "Unknown";
        numPages = 0;
        priceInDollars = 0;
        newYorkTimesBestSeller = false;
        publicationDate = LocalDate.now();
        bookCount++;
    }

    public Book(String title, int numPages, double priceInDollars, boolean newYorkTimesBestSeller, LocalDate publicationDate) {
        this.title = title;
        this.numPages = numPages;
        this.priceInDollars = priceInDollars;
        this.newYorkTimesBestSeller = newYorkTimesBestSeller;
        this.publicationDate = publicationDate;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getPriceInDollars() {
        return priceInDollars;
    }

    public boolean isNewYorkTimesBestSeller() {
        return newYorkTimesBestSeller;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setPriceInDollars(double priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public void setNewYorkTimesBestSeller(boolean newYorkTimesBestSeller) {
        this.newYorkTimesBestSeller = newYorkTimesBestSeller;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
