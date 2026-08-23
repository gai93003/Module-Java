package backlog;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface RentalCalculator {
    List<Rental> generateRentals(Contract contract);
}

abstract class AbstractRentalGenerator implements RentalCalculator {
    @Override
    public List<Rental> generateRentals(Contract contract) {
        ContractTerm term = contract.getTerm();
        double monthlyCapital = contract.getCarPrice() / term.getTotalMonths();
        double monthlyInterest = (contract.getCarPrice() * term.getInterestRate()) / term.getTotalMonths();
        LocalDate now = LocalDate.now();

        return IntStream.range(0, term.getTotalMonths())
                .mapToObj(i -> {
                    LocalDate dueDate = contract.getStartDate().plusMonths(i + 1);
                    boolean isPaid = !dueDate.isAfter(now);
                    return new Rental(dueDate, monthlyCapital, monthlyInterest, isPaid);
                })
                .collect(Collectors.toList());
    }
}

