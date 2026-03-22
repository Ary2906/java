package org.internship.assignments;

import java.util.Arrays;

public class SouvenirShop {

    public Object maxItems(String[] prices, String money) {
        // 1. Clean and convert "money" (remove everything except numbers)
        int budget = Integer.parseInt(money.replaceAll("[^0-9]", ""));

        // 2. Clean and convert "prices" array
        int[] intPrices = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            intPrices[i] = Integer.parseInt(prices[i].replaceAll("[^0-9]", ""));
        }

        // 3. Sort from cheapest to most expensive (Greedy approach)
        Arrays.sort(intPrices);

        int itemsBought = 0;

        // 4. Buy items starting from the cheapest
        for (int price : intPrices) {
            if (budget >= price) {
                budget -= price;
                itemsBought++;
            }
        }

        // 5. Return count or "Not enough funds!"
        return (itemsBought > 0) ? itemsBought : "Not enough funds!";
    }
}