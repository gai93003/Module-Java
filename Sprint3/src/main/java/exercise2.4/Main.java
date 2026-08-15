import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(22, 45, 35, 22, 41);
        List<String> firstNames = Arrays.asList("Anuket", "Eryn", "Filip", "Raquel", "Eryn");

        int max = grades.stream().mapToInt(v -> v).max().orElse(0);
        int min = grades.stream().mapToInt(v -> v).min().orElse(0);

        System.out.println("Max: " + max + ", Min: " + min);

        Set<String> duplicates = firstNames.stream()
                .filter(n -> Collections.frequency(firstNames, n) > 1)
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    }
}