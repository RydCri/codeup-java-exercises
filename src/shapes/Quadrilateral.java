package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected int length;
    protected int width;
    protected int area;
    protected int perimeter;
    public Quadrilateral(int l, int w) {
      this.length = l;
      this.width = w;
    }

    public void getArea() {
        this.area = this.width * this.length;
        System.out.println("Area: " + this.area + "\n");
    }

    public void getPerimeter() {
        this.perimeter = (this.width * 2) + (this.length * 2);
        System.out.println("Perimeter: " + this.perimeter);
    }

    public void shapeTest(){
    if(this.width == this.length){
        System.out.printf("Square sides: %d\n",length);
    }else{
        System.out.printf("Rectangle length: %d, width: %d\n",length,width);
    }
    }
    public static void main(String[] args) {

    }
}


