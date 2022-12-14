package product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Refrigerator", "JAPAN", 1000000, "Toshiba"));
        products.add(new Product(2, "Washing machinet", "USA", 102000, "USA"));
        products.add(new Product(3, "Air Conditional", "KOREA", 101200, "Toshiba"));
        products.add(new Product(4, "Electric fan", "VIET NAM", 10000, "Toshiba"));
        products.add(new Product(5, "Television", "EU", 8500, "Toshiba"));
        String path = "F:\\CodeGym\\Module2\\BinaryFile_Serialization_17\\src\\product_management\\text.txt";
        writeToFile(path, products);
        List<Product> productDataFromFile = readDataFromFile(path);
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
