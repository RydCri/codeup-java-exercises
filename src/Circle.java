import java.util.Scanner;

public class Circle {
    private int radius;
    private double area;
    private double circumference;
    private static double pi = 3.141567;
        Scanner sc = new Scanner(System.in);

    public Circle(){
        System.out.println("A circle has been instanced!");
        System.out.println("Enter the radius of the Circle");
        this.radius = sc.nextInt();
    }

    public void doubleRadius() {
        System.out.println("Radius doubled: " + (this.radius * this.radius));
    }
    public void getArea() {
        this.area = pi *(this.radius * this.radius);
        System.out.println("Area: " + this.area);
}
    public void getCircumference() {
        this.circumference = 2 * pi * this.radius;
        System.out.println("Circumference: " + this.circumference);
    }


    public static void main(String[] args) {
    Circle circ = new Circle();
    circ.doubleRadius();
    circ.getArea();
    circ.getCircumference();

    }
    }