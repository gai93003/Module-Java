package backlog;

import java.time.LocalDate;

public class Rental {
    private final LocalDate dueDate;
    private final double capitalAmount;
    private final double interestAmount;
    private final boolean paid;

    public Rental(LocalDate dueDate, double capitalAmount, double interestAmount, boolean paid) {
        this.dueDate = dueDate;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.paid = paid;
    }

    public LocalDate getDueDate() { return dueDate; }
    public double getCapitalAmount() { return capitalAmount; }
    public double getInterestAmount() { return interestAmount; }
    public double getTotalAmount() { return capitalAmount + interestAmount; }
    public boolean isPaid() { return paid; }
}