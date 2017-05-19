package JavaII;


public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getArea(){
        System.out.println("This is coming from the square class");
        return super.getArea();

    }

}
