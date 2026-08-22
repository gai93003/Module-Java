package exercise2_1;

import java.util.*;

class GradeBook {
    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public GradeBook(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    public List<String> getFirstNames() {
        return Arrays.asList(firstNames);
    }

    public Set<String> getDistinctFirstNames() {
        return new HashSet<>(Arrays.asList(firstNames));
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder() {
        return new TreeSet<>(Arrays.asList(firstNames));
    }

    public Map<String, Integer> getLastNameToGrade() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < lastNames.length; i++) {
            map.put(lastNames[i], grades[i]);
        }
        return map;
    }
}