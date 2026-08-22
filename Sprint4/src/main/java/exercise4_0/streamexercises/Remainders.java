package exercise4_0.streamexercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Remainders {

    public List<Integer> printRemainders(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .map(n -> n % divisor)
                .boxed()
                .toList();
    }

    public Map<Integer, List<Integer>> remainderGroups(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(n -> n % divisor));
    }

    public Map<Integer, Long> remainderCounts(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> n % divisor,
                        Collectors.counting()
                ));
    }
}