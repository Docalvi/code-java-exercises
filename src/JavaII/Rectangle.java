package JavaII;


public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getArea() {
        System.out.println("this is coming from the rectangle class.");
        return length * width;
    }
}
