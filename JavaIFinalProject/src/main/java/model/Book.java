package model;

import utilities.Helpers;

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

    public static String getHeaderRow() {
        return String.format("%-40s\t%-20s\t%10s\t%5s\t%-6s",
                "Title","Publication Date","Price","Pages","NY Times");
    }

    @Override
    public String toString() {
        return String.format("%-40s\t%-20s\t%10s\t%5d\t%-6s",
                this.title, Helpers.formatDate(this.publicationDate), 
                Helpers.formatCurrency(this.priceInDollars),
                this.numPages, this.newYorkTimesBestSeller ? "Yes" : "No" 
                );
    }
}
