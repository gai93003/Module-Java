package backlog;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RentalSummaryService rentalSummaryService = new RentalSummaryService();

        Contract oneYearContract = new Contract("John Smith", 25, LocalDate.of(2025, 8, 12), 1, 10000);
        Contract threeYearContract = new Contract("Jane Doe", 77, LocalDate.of(2024, 4, 1), 3, 50000);
        Contract completedContract = new Contract("Rosie Parker", 47, LocalDate.of(2021, 7, 10), 3, 40000);

        System.out.println("--- Executing Valid Contracts ---");
        rentalSummaryService.printRentalSummary(oneYearContract);
        rentalSummaryService.printRentalSummary(threeYearContract);
        rentalSummaryService.printRentalSummary(completedContract);

        System.out.println("--- Testing Invalid Contract Term ---");
        try {
            Contract twoYearContract = new Contract("Michael Jones", 56, LocalDate.of(2025, 12, 12), 2, 20000);
            rentalSummaryService.printRentalSummary(twoYearContract);
        } catch (IllegalArgumentException e) {
            System.err.println("Successfully caught invalid contract error: " + e.getMessage());
        }
    }
}