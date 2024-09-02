package dev.vhall1.potter_kata;

public class Basket {
    private int[] books;

    public Basket(int[] books) {
        this.books = books;
    }

    public int calculateTotal() {
        return this.books.length * 8;
    }
}
