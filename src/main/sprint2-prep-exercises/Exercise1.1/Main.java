public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Mouse", 25.00);
        Product p2 = new Product("Keyboard", 75.00, 50);
        Product p3 = new Product("Monitor", 200.00, 15);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}