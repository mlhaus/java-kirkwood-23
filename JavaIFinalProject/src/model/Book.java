package model;

import java.time.LocalDate;

public class Book {
    private String title;
    private int numPages;
    private double priceInDollars;
    private boolean read;
    private LocalDate datePurchased;
    private static int bookCount = 0;
    
    public Book() {
        title = "Unknown";
        numPages = 0;
        priceInDollars = 0;
        read = false;
        datePurchased = LocalDate.now();
    }

    public Book(String title, int numPages, double priceInDollars, boolean read, LocalDate datePurchased) {
        this.title = title;
        this.numPages = numPages;
        this.priceInDollars = priceInDollars;
        this.read = read;
        this.datePurchased = datePurchased;
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

    public boolean isRead() {
        return read;
    }

    public LocalDate getDatePurchased() {
        return datePurchased;
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

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setDatePurchased(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }
}
