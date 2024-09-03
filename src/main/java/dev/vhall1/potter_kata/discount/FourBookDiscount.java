package dev.vhall1.potter_kata.discount;

import java.util.Arrays;

public class FourBookDiscount implements Discount {
    public boolean isActive(int[] books) {
        var uniqueBooks = Arrays.stream(books).distinct().toArray();
        return uniqueBooks.length == 4;
    }

    public double discountMultiplier() {
        return 0.80;
    }
}