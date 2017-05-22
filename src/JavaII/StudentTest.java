package JavaII;

public class StudentTest {

    public static void main(String[] args) {
        Student studentJack = new Student("Jack");

        studentJack.addGrades(99);
        studentJack.addGrades(89);
        studentJack.addGrades(95);

        System.out.println(studentJack.getName());
        System.out.println(studentJack.getGradeAverage());
    }
}
