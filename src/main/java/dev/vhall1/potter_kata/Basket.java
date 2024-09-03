package dev.vhall1.potter_kata;


import dev.vhall1.potter_kata.discount.DiscountFactory;

public class Basket {
    private int[] books;

    public static final int BOOK_VALUE_IN_PENCE = 800;

    public Basket(int[] books) {
        this.books = books;
    }

    public double calculateTotal() {
        return this.books.length * BOOK_VALUE_IN_PENCE * DiscountFactory.calculateDiscount(this.books);
    }
}
