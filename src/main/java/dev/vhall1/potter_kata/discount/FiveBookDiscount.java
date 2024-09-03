package dev.vhall1.potter_kata.discount;

import java.util.Arrays;

public class FiveBookDiscount implements Discount {
    public boolean isActive(int[] books) {
        int[] uniqueBooks = Arrays.stream(books).distinct().toArray();
        return uniqueBooks.length == 5;
    }

    public double discountMultiplier() {
        return 0.75;
    }
}
