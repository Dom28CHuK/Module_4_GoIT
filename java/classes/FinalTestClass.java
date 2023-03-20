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

    public int[] removePrice(int[] prices, int toRemove) {
        int countToRemove = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                countToRemove++;
            }
        }
        int[] result = new int[prices.length - countToRemove];

        int countToAdd = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[countToAdd] = prices[i];
                countToAdd++;
            }
        }
        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for(int price: prices) {
            if (price%10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for(int price: prices) {
            if (price%10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {

        int arraysOne = showcaseStocks.length;
        int arraysTwo = warehouseStocks.length;

        String[] mergeArrays = new String[arraysOne + arraysTwo];

        for (int i = 0; i < arraysOne; i++) {
            mergeArrays[i] = showcaseStocks[i];
        }

        for (int i = 0; i < arraysTwo; i++) {
            mergeArrays[arraysOne + i] = warehouseStocks[i];
        }
        return mergeArrays;
    }
}
