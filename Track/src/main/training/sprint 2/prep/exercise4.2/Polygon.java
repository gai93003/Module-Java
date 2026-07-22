class Polygon {
    private final int numberOfSides;

//    public Polygon(String name) {
//
//    }

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

//    public void setNumberOfSides(int numberOfSides) {
//        this.numberOfSides = numberOfSides;
//    }

    public final void describe() {
        System.out.println("I am a polygon with " + getNumberOfSides() + " sides");
    }
}