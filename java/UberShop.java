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
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        int[] prices = new int[] {};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }
}
