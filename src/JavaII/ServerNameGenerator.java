package JavaII;

import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String adjectives[] = {
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

        String names[] = {
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

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("DO you want a random Name?");

        String yesNo = input.nextLine();
        if  (yesNo.equalsIgnoreCase("y")){
            int ranadj = random.nextInt(adjectives.length);
            int ranName = random.nextInt(names.length);

            System.out.println(adjectives[ranName] + " - " + names[ranadj]);

        }





    }



}
