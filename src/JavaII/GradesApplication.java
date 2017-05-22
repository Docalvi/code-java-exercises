package JavaII;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map map = new HashMap<>();

        Student studentJack = new Student("Jack");

        studentJack.addGrades(90);
        studentJack.addGrades(80);
        studentJack.addGrades(95);
        studentJack.addGrades(100);

        Student studentEmilio = new Student("Emilio");

        studentJack.addGrades(93);
        studentJack.addGrades(99);
        studentJack.addGrades(89);
        studentJack.addGrades(100);

        Student studentDaniel = new Student("Daniel");

        studentJack.addGrades(84);
        studentJack.addGrades(80);
        studentJack.addGrades(78);
        studentJack.addGrades(100);

        Student studentMark = new Student("Mark");

        studentJack.addGrades(88);
        studentJack.addGrades(75);
        studentJack.addGrades(68);
        studentJack.addGrades(91);

        map.put("jack8171", studentJack);
        map.put("emilio1911", studentEmilio);
        map.put("daniel5577", studentDaniel);
        map.put("mark8998", studentMark);

        System.out.println("Welcome,");
        System.out.println("Here is a list of our users:");
        map.forEach((key, value) -> {
            System.out.println(key);
        });

        System.out.println("Enter a username to see grade average:");
        String username = input.nextLine();

        map.get(username);  // it's null not there
       if  (map.containsKey(username)){
           System.out.println();
       }









//        switch (username) {
//            case "jack8171":
//                System.out.println(map.get("jack8171"));
//                break;
//            case "emilio1911":
//                System.out.println(map.get("emilio1911"));
//                break;
//            case "daniel5577":
//                System.out.println(map.get("daniel5577"));
//                break;
//            case "mark8998":
//                System.out.println(map.get("mark8998"));
//                break;
//            default:
//                System.out.println("Not a valid username.");
//        }

    }
}
