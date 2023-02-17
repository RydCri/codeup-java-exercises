package shapes;

class Rectangle {
    protected int length;
    protected int width;
   protected int sides;
    public int area;
    public int perimeter;
public Rectangle(int length,int width){
    this.length = length;
    this.width = width;
}
public void getArea(){
    this.area = this.width * this.length;
        System.out.println("Area:\t" + area+"\n");
    }
    public void getPerimeter(){
        this.perimeter = (this.width * 2) + (this.length * 2);
        System.out.println("Perimeter:\t" + perimeter);
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
