package dev.vhall1.potter_kata.discount;

import java.util.Arrays;

public class ThreeBookDiscount implements Discount {
    public boolean isActive(int[] books) {
        int[] uniqueBooks = Arrays.stream(books).distinct().toArray();
        return uniqueBooks.length == 3;
    }

    public double discountMultiplier() {
        return 0.9;
    }
}
