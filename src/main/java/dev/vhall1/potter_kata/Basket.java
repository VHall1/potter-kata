package dev.vhall1.potter_kata;

public class Basket {
    private int[] books;

    public static final int BOOK_VALUE_IN_PENCE = 800;

    public Basket(int[] books) {
        this.books = books;
    }

    public int calculateTotal() {
        return this.books.length * BOOK_VALUE_IN_PENCE;
    }
}
