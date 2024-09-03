package dev.vhall1.potter_kata;


import dev.vhall1.potter_kata.discount.DiscountFactory;

import java.util.List;

public class Basket {
    private final List<Integer> books;

    public static final int BOOK_VALUE_IN_PENCE = 800;

    public Basket(List<Integer> books) {
        this.books = books;
    }

    public double calculateTotal() {
        return this.books.size() * BOOK_VALUE_IN_PENCE * DiscountFactory.calculateDiscount(this.books);
    }


}
