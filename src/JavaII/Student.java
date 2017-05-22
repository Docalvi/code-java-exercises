package JavaII;

import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        Integer sum = 0;

        for (Integer mark : grades) {
            sum += mark;
        }
        return sum.doubleValue() / grades.size();

    }
}
