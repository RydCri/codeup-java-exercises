package shapes;

import java.util.Scanner;

public class CircleApp {
    Scanner cs = new Scanner(System.in);

    public static void main(String[] args) {
        Circle cc = new Circle();
        cc.getRadius();
        cc.getArea();
        cc.getCircumference();
        cc.nextCircle();
    }
}
