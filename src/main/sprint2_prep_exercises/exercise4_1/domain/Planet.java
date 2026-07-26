package sprint2_prep_exercises.exercise4_1.domain;

public class Planet {
    private String name;
    private static int planetCount = 0;

    public Planet(String name) {
        this.name = name;
        planetCount++;
    }

    public static int getPlanetCount() {
        return planetCount;
    }
}