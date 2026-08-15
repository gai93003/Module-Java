public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        GradeBook book = new GradeBook(firstNames, lastNames, grades);
        System.out.println("Distinct First Names: " + book.getDistinctFirstNamesInAlphabeticalOrder());
        System.out.println("Last Name to Grade: " + book.getLastNameToGrade());
    }
}