package JavaII;

/**
 * Created by emilioalvarado on 5/17/17.
 */
public class InputTest {
    public static void main(String[] args) {
        Input entry = new Input();
        System.out.println("Yes or no?");
        System.out.println(entry.yesNo());


        int min = 1;
        int max = 10;

        System.out.println("Give me a number between 1 and 10");
        System.out.println("The number " + entry.getInt(min, max) + " is valid ");


    }
}