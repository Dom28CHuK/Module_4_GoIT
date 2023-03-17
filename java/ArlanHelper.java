public class ArlanHelper {
    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result += "*";
                columns--;
            }
            result += "\n";
        }
        return result;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int row = height;
        while (row > 0) {
            int column = width;
            while (column > 0) {
                result += c;
                column--;
            }
            result += "\n";
            row--;
        }
        return result;
    }
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}
