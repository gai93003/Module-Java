package exercise2_2;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static Map<Student, Integer> getStudentToGrade(String[] f, String[] l, int[] g) {
        Map<Student, Integer> map = new HashMap<>();
        for (int i = 0; i < f.length; i++) {
            map.put(new Student(f[i], l[i]), g[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones", "Doe"};
        int[] grades = {22, 45, 35, 22, 41, 50};

        Map<Student, Integer> studentGrades = getStudentToGrade(firstNames, lastNames, grades);
        System.out.println("Student Grades: " + studentGrades);
    }
}