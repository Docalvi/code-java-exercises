package JavaII;

import java.util.Scanner;



/**
 * Created by emilioalvarado on 5/16/17.
 */
public class main {
    public static Scanner Input = new Scanner(System.in);
    public static void main(String[] args) {
    Person person = new Person();


        System.out.println("What is your name?");
        String userName = Input.nextLine();
        String myName = "Emilio Alvarado";
        person.setName(userName);
        person.sayHello();





    }

}
