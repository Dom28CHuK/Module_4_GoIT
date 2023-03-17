public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while (n > 0) {
            result += n * n;
            n--;
        }
        return result;
    }

    public int countSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
        public static void main(String[] args) {
            TrurlBank bank = new TrurlBank();
            ATM atm = new ATM();

            //Should be 14 - 1 + 4 + 9
            System.out.println(bank.sumQuads(3));
            System.out.println(bank.countSumOfDigits(547));

            System.out.println(atm.countBanknotes(500));
        }
}
