package producs_manager;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    ArrayList<Product> printAll();
    void add(Product newProduct);

    void update(Product newProduct);

    boolean existById(int id);

    Product checkById(int id);

    void deleteById(int id);

    void searchByName(String name);

    List<Product> findAllByPriceDESC();

    default List<Product> findALLByPriceASC() {
        return null;
    }

}