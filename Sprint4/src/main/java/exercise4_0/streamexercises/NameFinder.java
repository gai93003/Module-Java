package exercise4_0.streamexercise;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameFinder {

    public void printNamesStartingWithA(Collection<String> names) {
        names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .forEach(System.out::println);
    }

    public List<String> vowelNamesCapitalisedDescending(Collection<String> names) {
        return names.stream()
                .filter(name -> name.matches("(?i)^[aeiou].*"))
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}