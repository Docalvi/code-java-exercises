package io;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * Created by emilioalvarado on 5/8/17.
 */
public class consoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age;
//        System.out.println("How old are you?");
//        age = sc.nextInt();
//        System.out.println("You are " + age + " years old");


//        String firstName;
//        String lastName;
//        String state;
//
//        System.out.println("Enter your first name, last name, and the state you live in: ");
//        firstName = sc.nextLine();
//        lastName = sc.nextLine();
//        state = sc.nextLine();
//        System.out.println("Your first name is " + firstName + ", your last name is " + lastName + ", the state you live is " + state);
//

//        System.out.println("What do you like to do on the weekends?");
//        String answer;
//        answer = sc.nextLine();
//        System.out.println("You like to " + answer);

        System.out.println("What is the length and width of the classroom?");
        int length = sc.nextInt();
        int width  = sc.nextInt();
        int area = length * width;
        int perimeter = (2 * length) * (2 * width);
        System.out.println("the area of the classroom is " + area + " and it's perimeter is " + perimeter);

    }
}
