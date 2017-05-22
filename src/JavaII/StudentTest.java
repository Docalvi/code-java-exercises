package JavaII;

public class StudentTest {

    public static void main(String[] args) {
        Student studentJack = new Student("Jack");

        studentJack.addGrades(90);
        studentJack.addGrades(80);
        studentJack.addGrades(95);
        studentJack.addGrades(100);

        System.out.println(studentJack.getName());
        System.out.println(studentJack.getGradeAverage());
    }
}
