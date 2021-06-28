package JavaLabCucManh.Day3.Homework_FS.Model;

public class Fruit {
    private String FruitID;
    private String FruitName;
    private double price;
    private int quantity;
    private String Origin;

    public Fruit(String fruitID, String fruitName, double price, int quantity, String origin) {
        FruitID = fruitID;
        FruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        Origin = origin;
    }

    public String getFruitID() {
        return FruitID;
    }

    public void setFruitID(String fruitID) {
        FruitID = fruitID;
    }

    public String getFruitName() {
        return FruitName;
    }

    public void setFruitName(String fruitName) {
        FruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "FruitID='" + FruitID + '\'' +
                ", FruitName='" + FruitName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", Origin='" + Origin + '\'' +
                '}';
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}
