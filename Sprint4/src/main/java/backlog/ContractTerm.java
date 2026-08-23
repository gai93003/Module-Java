package backlog;

public enum ContractTerm {
    ONE_YEAR(1, 12, 0.02),
    THREE_YEAR(3, 36, 0.03);

    private final int years;
    private final int totalMonths;
    private final double interestRate;

    ContractTerm(int years, int totalMonths, double interestRate) {
        this.years = years;
        this.totalMonths = totalMonths;
        this.interestRate = interestRate;
    }

    public int getYears() { return years; }
    public int getTotalMonths() { return totalMonths; }
    public double getInterestRate() { return interestRate; }

    public static ContractTerm fromYears(int years) {
        for (ContractTerm term : values()) {
            if (term.getYears() == years) {
                return term;
            }
        }
        throw new IllegalArgumentException("Invalid contract length: " + years + " years. Allowed terms are 1 or 3 years.");
    }
}