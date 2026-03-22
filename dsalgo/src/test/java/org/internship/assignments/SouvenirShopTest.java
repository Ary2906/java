package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SouvenirShopTest {

    SouvenirShop shop = new SouvenirShop();

    @Test
    void testBasicPurchase() {
        String[] prices = {"$1", "$1", "$2"};
        assertEquals(2, shop.maxItems(prices, "$3"));
    }

    @Test
    void testMixedPrices() {
        String[] prices = {"$10", "$7", "$2", "$60"};
        // Sorted: 2, 7, 10, 60. With $20, can buy 2+7+10 = 19. Count = 3.
        assertEquals(3, shop.maxItems(prices, "$20"));
    }

    @Test
    void testInsufficientFunds() {
        String[] prices = {"$15", "$5", "$30", "$30", "$10"};
        assertEquals("Not enough funds!", shop.maxItems(prices, "$2"));
    }

    @Test
    void testExactBudget() {
        String[] prices = {"$5", "$5"};
        assertEquals(2, shop.maxItems(prices, "$10"));
    }
}