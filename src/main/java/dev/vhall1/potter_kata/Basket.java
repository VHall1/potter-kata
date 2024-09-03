package dev.vhall1.potter_kata;


import dev.vhall1.potter_kata.discount.DiscountFactory;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Integer> books;

    public static final int BOOK_VALUE_IN_PENCE = 800;

    public Basket(List<Integer> books) {
        this.books = books;
    }

    public double calculateTotal() {
        var groupedBooks = this.groupBooks();
        double total = 0;
        for (var bookGroup : groupedBooks) {
            var discount = DiscountFactory.calculateDiscount(bookGroup);
            total += bookGroup.size() * BOOK_VALUE_IN_PENCE * discount;
        }
        return total;
    }

    private List<List<Integer>> groupBooks() {
        var groupedBooks = new ArrayList<List<Integer>>();

        mainLoop:
        for (var book : this.books) {
            for (var bookGroup : groupedBooks) {
                if (!bookGroup.contains(book)) {
                    bookGroup.add(book);
                    continue mainLoop;
                }
            }
            groupedBooks.add(new ArrayList<>(List.of(book)));
        }
        return groupedBooks;
    }
}
