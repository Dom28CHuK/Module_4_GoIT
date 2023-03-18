package classes;

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

}
