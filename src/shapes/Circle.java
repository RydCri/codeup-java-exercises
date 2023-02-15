package shapes;

import java.util.Scanner;

public class Circle {
    private int radius;
    private double area;
    private double circumference;
    private String input;
    private static double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);

    public Circle() {
        System.out.println("A circle has been instanced!");
    }
    public void getRadius() {
        System.out.println("Enter the radius of the circle");
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

    public void nextCircle() {
        System.out.println("\nCreate another Circle? yes/no");
       this.input = cs.nextLine();
            if (this.input.matches("(?i)y|yes|true")) {
        do {
            new Circle();
            this.getRadius();
            this.getArea();
            this.getCircumference();
            System.out.println("\n=============\n");
            System.out.println("Create another Circle? yes/no");
            this.input = cs.nextLine();
        }
            while(this.input.matches("(?i)y|yes|true"));
            } else if (this.input.matches("(?i)n|no|false")) {
                this.input = String.valueOf(false);
            }
                System.out.println("\nNo more circles!");

        }



    public static void main(String[] args) {
    Circle circ = new Circle();
    circ.getRadius();
    circ.doubleRadius();
    circ.getArea();
    circ.getCircumference();

    }
    }