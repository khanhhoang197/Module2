package producs_manager;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product(){

    }
    public Product(int id, String name, int quantity, double unitPrice){
        this.productId = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-43s %-20s %-20s", productId, name, quantity, unitPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && quantity == product.quantity && Double.compare(product.unitPrice, unitPrice) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, quantity, unitPrice);
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
