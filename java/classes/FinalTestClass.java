package classes;

import java.util.Arrays;

public class FinalTestClass {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {

        if (prices.length == 0) {
            return new int[] {};
        }

        int maxPrice = prices[0];
        int minPrice = prices[0];

        int[] minMaxPrices = new int[2];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        if (maxPrice == minPrice) {
            int[] oneElement = {maxPrice};
            return oneElement;
        } else {
            minMaxPrices[0] = minPrice;
            minMaxPrices[1] = maxPrice;
        }
        return minMaxPrices;
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int count = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                count = 1;
            } else if (prices[i] == minPrice) {
                count++;
            }
        }
        return count;
    }
}
