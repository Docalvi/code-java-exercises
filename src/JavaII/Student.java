package JavaII;

import java.util.ArrayList;


public class Student {

    private String Name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        Name = name;
        this.grades = grades;
    }

    public String getName() {
        return Name;
    }

    public void addGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double getGradeAverage() {
        Integer sum = 0;

        for (Integer mark : grades) {
            sum += mark;
        }
        return sum.doubleValue() / grades.size();

    }
}
