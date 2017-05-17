package JavaII;

import java.util.Scanner;

/**
 * Created by emilioalvarado on 5/17/17.
 */
public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String getString() {
        return scan.nextLine();
    }

    public boolean yesNo() {
        String answer = this.getString();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }


    public int getInt() {
        return scan.nextInt();
    }

    public int getInt(int min, int max) {
        int num = this.getInt();

        if(num >= min && num <= max){
            return num;
        }
        System.out.println("Number "+ num + " is not valid. Try Again.");
        return getInt(min, max);
    }


}
