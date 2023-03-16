import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] pricesPrint) {
        for (float i = 0; i < pricesPrint.length; i++) {
            System.out.println(pricesPrint[(int) i] + " jup.");
        }
//        for (float price: prices) {
//            System.out.println(price + " jup.");
//        }
    }

    public void  multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        Arrays.sort(prices);
        int[] resultSort = new int[2];

            resultSort[0] = prices[0];
            resultSort[1] = prices[prices.length - 1];

            if (resultSort[0] == resultSort[1]) {
                return new int[]{resultSort[0]};
            }

        return resultSort;
//-------------------------------------------------------------
//        int[] result = new int[2];
//
//        if (prices.length == 0) {
//            return new int[] {};
//        }
//
//        int minPrice = prices[0];
//        int maxPrice = prices[0];
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            } else if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//            }
//        }
//
//        if (minPrice == maxPrice) {
//            result = new int[] {minPrice};
//        } else {
//            result[0] = minPrice;
//            result[1] = maxPrice;
//        }
//        return result;
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int minPriceCount = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minPriceCount = 1;
            } else if (prices[i] == minPrice) {
                minPriceCount++;
            }
        }
        return minPriceCount;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int countToRemove = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                countToRemove++;
            }
        }
        int[] result = new int[prices.length - countToRemove];

        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[j] = prices[i];
                j++;
            }
        }
        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                result[j] = prices[i];
                j++;
            }
        }
        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
//        int showcaseLength = showcaseStocks.length;
//        int werehouseLength = warehouseStocks.length;
//
//        String[] mergeStocks = new String[showcaseLength + werehouseLength];
//
//        for (int i = 0; i < showcaseLength; i++) {
//            mergeStocks[i] = showcaseStocks[i];
//        }
//
//        for (int i = 0; i < werehouseLength; i++) {
//            mergeStocks[showcaseLength + i] = warehouseStocks[i];
//        }
//        return mergeStocks;
// --------------------------------------------------------------
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        int index = 0;
        for (String stock: showcaseStocks) {
            result[index] = stock;
            index++;
        }

        for (String stock: warehouseStocks) {
            result[index] = stock;
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {};
        String[] warehouseStocks = new String[] {};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}
