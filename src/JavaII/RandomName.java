package JavaII;

import java.util.Random;
import java.util.Scanner;

public class RandomName {

    public static String adjectives[] = {
            "Colorful",
            "Bold",
            "Wild",
            "Insightful",
            "Joyful",
            "Hectic",
            "Eager",
            "Obtuse",
            "Lovable",
            "Shady"

    };

    public static String names[] = {
            "Joey",
            "John",
            "Albert",
            "Ashley",
            "Valerie",
            "Louis",
            "Dom",
            "Danny",
            "Marcus",
            "Steven"
    };
    public static String ran(){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want a random Name?");

        String yesNo = input.nextLine();
        if  (yesNo.equalsIgnoreCase("y")){
            int ranadj = random.nextInt(adjectives.length);
            int ranName = random.nextInt(names.length);

            return  adjectives[ranadj] + " - " + names[ranName];

        } else {
            return "Alright. Have it your way.";

        }
    }
}


