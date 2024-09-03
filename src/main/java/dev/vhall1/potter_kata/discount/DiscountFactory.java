package dev.vhall1.potter_kata.discount;

import java.util.Arrays;

public class DiscountFactory {
    public static final Class<? extends Discount>[] DISCOUNT_CLASSES = new Class[]{TwoBookDiscount.class, ThreeBookDiscount.class, FourBookDiscount.class, FiveBookDiscount.class};

    public static double calculateDiscount(int[] books) {
        for (Class<? extends Discount> discountClass : DISCOUNT_CLASSES) {
            try {
                Discount discount = discountClass.newInstance();
                if (discount.isActive(books)) {
                    return discount.discountMultiplier();
                }
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        return 1;
    }
}
