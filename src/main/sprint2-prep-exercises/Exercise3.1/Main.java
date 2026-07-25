public class Main {
    public static void main(String[] args) {
        AnimalShow show = new AnimalShow();

        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal parrot = new Parrot("Polly");

        show.perform(dog);
        show.perform(cat);
        show.perform(parrot);
    }
}