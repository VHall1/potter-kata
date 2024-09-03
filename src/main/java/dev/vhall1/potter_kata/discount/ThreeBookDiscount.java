package dev.vhall1.potter_kata.discount;

import java.util.List;

public class ThreeBookDiscount implements Discount {
    public boolean isActive(List<Integer> books) {
        var uniqueBooks = books.stream().distinct().toList();
        return uniqueBooks.size() == 3;
    }

    public double discountMultiplier() {
        return 0.9;
    }
}
