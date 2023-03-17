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

    public String drawLine(int length) {
        String result = "";
        int i = 0;
        while (i < length) {
            if(i % 2 == 0) {
                result += "*";
            } else {
                result += "#";
            }
            i++;
        }
        return result;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        int i = 0;

        while (i < pattern.length * repeatCount) {
            char c = pattern[i % pattern.length];
            result += c;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
