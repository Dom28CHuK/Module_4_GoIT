package classes;

public class ForPractice {
    public int evenNumbers(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return number;
    }

    public void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

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
}
