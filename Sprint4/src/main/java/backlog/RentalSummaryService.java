package backlog;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;
import java.util.List;

public class RentalSummaryService {
    private final Map<ContractTerm, RentalCalculator> generators;

    public RentalSummaryService() {
        this.generators = Map.of(
                ContractTerm.ONE_YEAR, new OneYearContractRentalGenerator(),
                ContractTerm.THREE_YEAR, new ThreeYearContractRentalGenerator()
        );
    }

    private Optional<RentalSummary> generateRentalSummary(Contract contract) {
        LocalDate currentDate = LocalDate.now();
        LocalDate finalDueDate = contract.getStartDate().plusYears(contract.getTerm().getYears());

        if (currentDate.isAfter(finalDueDate)) {
            return Optional.empty();
        }

        RentalCalculator calculator = generators.get(contract.getTerm());
        if (calculator == null) {
            throw new IllegalStateException("No generator registered for term: " + contract.getTerm());
        }

        List<Rental> rentals = calculator.generateRentals(contract);
        return Optional.of(new RentalSummary(
                contract.getCustomerName(),
                contract.getCustomerAge(),
                contract.getStartDate(),
                contract.getEndDate(),
                rentals
        ));
    }

    public void printRentalSummary(Contract contract) {
        Optional<RentalSummary> summaryOpt = generateRentalSummary(contract);

        if (summaryOpt.isEmpty()) {
            System.out.println("Contract for " + contract.getCustomerName() + " is completed. No summary generated.");
            return;
        }

        RentalSummary summary = summaryOpt.get();
        LocalDate now = LocalDate.now();

        System.out.println("RENTAL SUMMARY for " + summary.getCustomerName());
        System.out.println("Start: " + summary.getStartDate() + " | End: " + summary.getEndDate());
        System.out.println("Total Capital: $" + summary.getTotalCapital());
        System.out.println("Total Interest: $" + summary.getTotalInterest());
        System.out.println("Outstanding Rentals: " + summary.getRemainingOutstandingCount(now));
    }
}