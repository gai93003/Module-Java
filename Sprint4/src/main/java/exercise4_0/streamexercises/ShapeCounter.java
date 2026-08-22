package exercise4_0.streamexercise;

import java.util.Map;

public class ShapeCounter {

    public int countShapesWithSides(Map<String, Integer> shapesToSides, int sides) {
        return (int) shapesToSides.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == sides)
                .count();
    }
}