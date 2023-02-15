import util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sb = new Scanner();
        sb.getString();
        sb.yesNo();
        sb.getInt(1,10);
        sb.getDouble(1.00001d,1.99999d);
    }
}
