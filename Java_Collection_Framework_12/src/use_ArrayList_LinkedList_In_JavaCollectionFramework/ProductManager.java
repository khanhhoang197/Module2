package use_ArrayList_LinkedList_In_JavaCollectionFramework;

import producs_manager.ProductViews;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    public final ArrayList<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
        productList.add(new Product(1, "Đèn trụ cổng", 300, 650000));
        productList.add(new Product(2, "Đèn sân vườn", 400, 1250000));
        productList.add(new Product(3, "Đèn pha 100w", 200, 850000));
        productList.add(new Product(4, "Đèn pha 200w", 500, 1250000));


    }


    public ArrayList<Product> printAll() {
        return productList;
    }

    public void add(Product newProduct) {
        productList.add(newProduct);
    }


    public void update(Product newProduct) {

        for (Product p : productList) {
            if (p.getProductId() == newProduct.getProductId()) {
                String name = newProduct.getName();
                if (name != null && !name.isEmpty())
                    p.setName(name);

                if (newProduct.getUnitPrice() != 0) {
                    double unitPrice = newProduct.getUnitPrice();
                    p.setUnitPrice(unitPrice);
                }

            }
        }
    }


    public boolean existById(int id) {
        return checkById(id) != null;
    }


    public Product checkById(int id) {
        for (Product product : productList) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }


    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getProductId()) {
                productList.remove(id);
            }
        }
    }


    public void searchByName(String name) {
        int count = 0;
        for (Product product : productList) {
            if ((product.getName().toUpperCase()).contains(name.toUpperCase())) {
                count++;
                System.out.println(product);
            }
        }
        if (count < 1) {
            System.out.println("Không tìm thấy");
        }
    }


    public List<Product> findAllByPriceDESC() {
        List<Product> sortPriceASC = new ArrayList<>(productList);
        sortPriceASC.sort(new SortByPriceDESC());
        return sortPriceASC;
    }


    public List<Product> findALLByPriceASC() {
        List<Product> sortPriceDESC = new ArrayList<>(productList);
        sortPriceDESC.sort(new SortByPriceASC());
        return sortPriceDESC;
    }


    private static class SortByPriceASC implements Comparator<Product> {
        @Override
        public int compare(Product productOne, Product productTwo) {
            return Double.compare(productOne.getUnitPrice(), productTwo.getUnitPrice());
        }
    }

    private static class SortByPriceDESC implements Comparator<Product> {
        @Override
        public int compare(Product productOne, Product productTwo) {
            return Double.compare(productTwo.getUnitPrice(), productOne.getUnitPrice());
        }
    }

    public static void main(String[] args) {
        ProductViews productViews = new ProductViews();
        productViews.menuManager();
    }
}
