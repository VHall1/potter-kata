package dev.vhall1.potter_kata.discount;

import java.util.List;

public interface Discount {
    boolean isActive(List<Integer> books);

    double discountMultiplier();

}
