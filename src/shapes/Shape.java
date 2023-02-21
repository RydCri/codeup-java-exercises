package shapes;

abstract public class Shape {


    public static void main(String[] args) {

    Quadrilateral q1 = new Rectangle(3,4);
    q1.shapeTest();
    q1.getPerimeter();
    q1.getArea();

    Quadrilateral q2 = new Square(3);
    q2.shapeTest();
    q2.getPerimeter();
    q2.getArea();
    }
}
