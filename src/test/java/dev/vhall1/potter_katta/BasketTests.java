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

    @Nested
    @DisplayName("discount is applied when there are no repeated books and")
    class NoRepeatDiscounts {
        @Test
        @DisplayName("two books are purchased")
        void twoBooks() {
            Basket basket = new Basket(new int[]{0, 1});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE * 2 * 0.95, basket.calculateTotal());
        }

        @Test
        @DisplayName("three books are purchased")
        void threeBooks() {
            Basket basket = new Basket(new int[]{0, 2, 4});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE * 3 * 0.9, basket.calculateTotal());
        }

        @Test
        @DisplayName("four books are purchased")
        void fourBooks() {
            Basket basket = new Basket(new int[]{0, 1, 2, 4});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE * 4 * 0.8, basket.calculateTotal());
        }

        @Test
        @DisplayName("five books are purchased")
        void fiveBooks() {
            Basket basket = new Basket(new int[]{0, 1, 2, 3, 4});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE * 5 * 0.75, basket.calculateTotal());
        }
    }

    @Nested
    @DisplayName("several discounts are applied when")
    class RepeatDiscounts {
        @Test
        @DisplayName("two unique books are purchased plus one extra book")
        void twoUniqueBooksPlusOne() {
            Basket basket = new Basket(new int[]{0, 0, 1});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE + (Basket.BOOK_VALUE_IN_PENCE * 2 * 0.95), basket.calculateTotal());
        }

        @Test
        @DisplayName("two unique books are purchased plus two unique books")
        void twoUniqueBooksPlusTwo() {
            Basket basket = new Basket(new int[]{0, 0, 1, 1});
            assertEquals(2 * (Basket.BOOK_VALUE_IN_PENCE * 2 * 0.95), basket.calculateTotal());
        }

        @Test
        @DisplayName("four unique books are purchased plus two unique books")
        void fourUniqueBooksPlusTwo() {
            Basket basket = new Basket(new int[]{0, 0, 1, 2, 2, 3});
            assertEquals((Basket.BOOK_VALUE_IN_PENCE * 4 * 0.8) + (Basket.BOOK_VALUE_IN_PENCE * 2 * 0.95), basket.calculateTotal());
        }

        @Test
        @DisplayName("five unique books are purchased plus one extra book")
        void fiveUniqueBooksPlusOne() {
            Basket basket = new Basket(new int[]{0, 1, 1, 2, 3, 4});
            assertEquals(Basket.BOOK_VALUE_IN_PENCE + (Basket.BOOK_VALUE_IN_PENCE * 5 * 0.75), basket.calculateTotal());
        }
    }
}
