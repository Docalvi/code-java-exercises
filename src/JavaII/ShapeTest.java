package JavaII;

/**
 * Created by emilioalvarado on 5/19/17.
 */
public class ShapeTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The rectangle's area is: " + box1.getArea());
        System.out.println("The rectangle's perimeter is: " + box1.getPerimeter());


        Rectangle box2 = new Square(5);
        System.out.println("The square's area is: " + box2.getArea());
        System.out.println("The square's perimeter is: " + box2.getPerimeter());


    }
}
