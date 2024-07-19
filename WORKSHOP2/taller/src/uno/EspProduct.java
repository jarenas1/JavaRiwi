package uno;

public class EspProduct extends Product {

    private String category;
    private String brand;

    public EspProduct() {
    }

    public EspProduct(int id, String name, double price, String brand, String category) {
        super(id, name, price);
        this.brand = brand;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
