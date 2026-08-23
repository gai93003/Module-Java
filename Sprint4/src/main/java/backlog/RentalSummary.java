package backlog;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RentalSummary {
    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final List<Rental> rentals;

    public RentalSummary(String customerName, int customerAge, LocalDate startDate, LocalDate endDate, List<Rental> rentals) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentals = List.copyOf(rentals);
    }

    public String getCustomerName() { return customerName; }
    public int getCustomerAge() { return customerAge; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }

    public List<Rental> getRentalsSorted() {
        return rentals.stream()
                .sorted(Comparator.comparing(Rental::getDueDate))
                .collect(Collectors.toList());
    }

    public Optional<Rental> getNextDueRental(LocalDate currentDate) {
        return rentals.stream()
                .filter(r -> r.getDueDate().isAfter(currentDate))
                .min(Comparator.comparing(Rental::getDueDate));
    }

    public double getTotalCapital() {
        return rentals.stream().mapToDouble(Rental::getCapitalAmount).sum();
    }

    public double getTotalInterest() {
        return rentals.stream().mapToDouble(Rental::getInterestAmount).sum();
    }

    public long getRemainingOutstandingCount(LocalDate currentDate) {
        return rentals.stream().filter(r -> r.getDueDate().isAfter(currentDate)).count();
    }
}