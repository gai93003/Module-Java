package backlog;

import java.time.LocalDate;

public class Contract {
    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final double carPrice;
    private final ContractTerm term;

    public Contract(String customerName, int customerAge, LocalDate startDate, int contractLengthYears, double carPrice) {
        if (customerAge < 18) {
            throw new IllegalArgumentException("Customer must be at least 18 years old.");
        }
        if (carPrice <= 0) {
            throw new IllegalArgumentException("Car price must be greater than zero.");
        }
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.term = ContractTerm.fromYears(contractLengthYears);
        this.carPrice = carPrice;
    }

    public String getCustomerName() { return customerName; }
    public int getCustomerAge() { return customerAge; }
    public LocalDate getStartDate() { return startDate; }
    public double getCarPrice() { return carPrice; }
    public ContractTerm getTerm() { return term; }

    public LocalDate getEndDate() {
        return startDate.plusYears(term.getYears());
    }
}