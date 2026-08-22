package exercise2_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstNames = new ArrayList<>(Arrays.asList("Anuket", "Eryn", "Filip", "Raquel", "Eryn"));
        Map<String, Integer> gradesMap = new HashMap<>();
        gradesMap.put("Hassan", 22);

        firstNames.add("NewStudent");

        firstNames.remove("Anuket");

        gradesMap.put("Hassan", 0);

        System.out.println("Updated List: " + firstNames);
        System.out.println("Updated Map: " + gradesMap);
    }
}