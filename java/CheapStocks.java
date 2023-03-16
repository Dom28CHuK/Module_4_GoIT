public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String cheapStocks = "";
        for (String stock : stocks) {
            String[] parts = stock.split(" ");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            if (price < 200) {
                cheapStocks += name + " ";
            }
        }
        return cheapStocks.trim();
    }

    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();

        System.out.println(cheapStocks.getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}));
    }
}
