public class TriangleDrawer {
    public String drawTriangle(int side) {
        String result = "";
        int lines = side;

        while (lines > 0) {
            int stars = lines;
            while (stars > 0) {
                result += "*";
                stars--;
            }
            result += "\n";
            lines--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}
