public class Product {
    private String name;
    private double price;
    private int stockCount;

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int stockCount) {
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void getPrice(double price) {
        this.price = price;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    @Override
    public String toString() {
        return "Product{" + "name= " + name + ", price=" + price + ", stockCount=" + stockCount + '}';
    }
}