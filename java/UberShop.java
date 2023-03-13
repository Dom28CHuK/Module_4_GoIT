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
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        float[] pricesPrint = new float[] {100f, 23.5f, 400f};
        shop.printPrices(pricesPrint);

        float[] prices = new float[] {100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
}
