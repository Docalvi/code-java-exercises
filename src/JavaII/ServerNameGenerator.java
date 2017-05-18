package JavaII;

import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String yesNo = input.nextLine();

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



        System.out.println("Do you want a random Name?");





            if (yesNo.equalsIgnoreCase("y")) {
                int ranadj = random.nextInt(adjectives.length);
                int ranName = random.nextInt(names.length);

                System.out.println(adjectives[ranName] + " - " + names[ranadj]);

            }




    }



}
