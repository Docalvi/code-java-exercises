package io; /**
 * Created by emilioalvarado on 5/12/17.
 */

import java.util.Scanner;

public class basicArthmetic {
    public static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
//        int y = 5;
//        int x = 1;
//
//        System.out.println(adding(y, x));
//        System.out.println(subtract(y, x));
//        System.out.println(multiply(y, x));
//        if (x != 0){
//            System.out.println(divide(y,x));
//        } else  {
//            System.out.println("cant divide by 0");
//        }
//        if (x != 0){
//            System.out.println(modulus(y,x));
//        } else {
//            System.out.println("cant be done");
//        }


        int userInput = getInteger(1, 10);
        System.out.println(userInput);

    }

    //    public static int adding(int num1, int num2){
//    int answer = num1 + num2;
//    return answer;
//    }
//
//    public static int subtract(int num1, int num2){
//        int answer = num1 - num2;
//        return answer;
//    }
//    public static int multiply(int num1, int num2){
//        int answer = num1 * num2;
//        return answer;
//    }
//    public static int divide(int num1, int num2){
//        int answer = num1 / num2;
//        return answer;
//    }
//    public static int modulus(int num1, int num2){
//        int answer = num1 % num2;
//        return answer;
//    }


    public static int getInteger(int min, int max) {
        System.out.println("Pick a Number between 1 and 10.");
        int userInput = Input.nextInt();
        if (min <= userInput && userInput <= max) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }

}