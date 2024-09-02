package dev.vhall1.potter_katta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.vhall1.potter_kata.Basket;
import org.junit.jupiter.api.Test;

public class BasketTests {
    @Test
    void noDiscount() {
        Basket basket = new Basket(new int[0]);
        assertEquals(0, basket.calculateTotal());
    }
}
