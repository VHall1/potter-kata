package dev.vhall1.potter_kata.discount;

public interface Discount {
    boolean isActive(int[] books);

    double discountMultiplier();

}
