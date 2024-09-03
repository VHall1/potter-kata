package dev.vhall1.potter_kata.discount;

import java.util.List;

public class FourBookDiscount implements Discount {
    public boolean isActive(List<Integer> books) {
        var uniqueBooks = books.stream().distinct().toList();
        return uniqueBooks.size() == 4;
    }

    public double discountMultiplier() {
        return 0.80;
    }
}