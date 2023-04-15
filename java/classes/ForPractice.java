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
}
