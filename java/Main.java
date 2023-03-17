import classes.ATM;
import classes.TrurlBank;

public class Main {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();
        ATM atm = new ATM();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
        System.out.println(bank.countSumOfDigits(547));

        System.out.println(atm.countBanknotes(500));
    }
}
