import classes.ForPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ForPractice forPractice = new ForPractice();

//        System.out.println(forPractice.evenNumbers(100));
//        forPractice.multiplicationTable();

//        float[] prices = new float[] {100f, 23.5f, 400f};
//        forPractice.printPrices(prices);

          float[] price = new float[] {100f, 1500f};
          forPractice.multiplyPrices(price);
        System.out.println(Arrays.toString(price));



    }
}
