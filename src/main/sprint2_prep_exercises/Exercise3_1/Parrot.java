class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawk: Squawk! Wants a cracker");
    }
}