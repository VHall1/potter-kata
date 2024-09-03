package dev.vhall1.potter_kata.discount;

import java.util.Arrays;

public class TwoBookDiscount implements Discount {
    public boolean isActive(int[] books) {
        var uniqueBooks = Arrays.stream(books).distinct().toArray();
        return uniqueBooks.length == 2;
    }

    public double discountMultiplier() {
        return 0.95;
    }
}
