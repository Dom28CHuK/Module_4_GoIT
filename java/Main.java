import classes.ATM;
import classes.FinalTestClass;
import classes.TrurlBank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        TrurlBank bank = new TrurlBank();
//        ATM atm = new ATM();
//
//        System.out.println(bank.sumQuads(3));
//        System.out.println(bank.countSumOfDigits(547));
//
//        System.out.println(atm.countBanknotes(500));

        FinalTestClass shop = new FinalTestClass();

//        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[] {100f, 23.5f, 400f};
//        shop.printPrices(prices);
        float[] prices = new float[] {100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));


    }
}
