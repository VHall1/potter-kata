package dev.vhall1.potter_katta;

import dev.vhall1.potter_kata.Basket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTests {
    @Nested
    @DisplayName("no discount is applied")
    class NoDiscount {
        @Test
        @DisplayName("when no books are purchased")
        void noBooks() {
            Basket basket = new Basket(new int[]{});
            assertEquals(0, basket.calculateTotal());
        }

        @Test
        @DisplayName("when a single book is purchased")
        void singleBook() {
            Basket basket = new Basket(new int[]{1});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE, basket.calculateTotal());
        }

        @Test
        @DisplayName("when the same book is purchased multiple times")
        void threeRepeatedBooks() {
            Basket basket = new Basket(new int[]{1, 1, 1});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE * 3, basket.calculateTotal());
        }
    }

}
