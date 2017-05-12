/**
 * Created by emilioalvarado on 5/12/17.
 */
public class basicArthmetic {
    public static void main(String[] args) {
        int y = 5;
        int x = 1;

        System.out.println(adding(y, x));
        System.out.println(subtract(y, x));
        System.out.println(multiply(y, x));
        if (x != 0){
            System.out.println(divide(y,x));
        } else  {
            System.out.println("cant divide by 0");
        }
        if (x != 0){
            System.out.println(modulus(y,x));
        } else {
            System.out.println("cant be done");
        }
    }

    public static int adding(int num1, int num2){
    int answer = num1 + num2;
    return answer;
    }

    public static int subtract(int num1, int num2){
        int answer = num1 - num2;
        return answer;
    }
    public static int multiply(int num1, int num2){
        int answer = num1 * num2;
        return answer;
    }
    public static int divide(int num1, int num2){
        int answer = num1 / num2;
        return answer;
    }
    public static int modulus(int num1, int num2){
        int answer = num1 % num2;
        return answer;
    }

}
