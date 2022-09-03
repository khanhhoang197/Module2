package producs_manager;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ProductViews {
    IProductService productService = new ProductService();
    Locale currency = new Locale("vi", "VN");
    NumberFormat num = NumberFormat.getCurrencyInstance(currency);
    public Scanner scanner = new Scanner(System.in);
    private String name;
    private int quantity;
    private double unitPrice;

    public void addProduct() {
 //       long id = S
        System.out.println("Nhập id: ");
        System.out.print("➥ ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            System.out.println("id đã tồn tại!");
        } else {
            System.out.println("Nhập tên sản phẩm: ");
            System.out.print("➥ ");
            String name = scanner.nextLine();
            System.out.println("Nhập số lượng của sản phẩm: ");
            System.out.print("➥ ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giá của sản phẩm: ");
            System.out.print("➥ ");
            double unitPrice = Double.parseDouble(scanner.nextLine());
            Product product = new Product(id, name, quantity, unitPrice);
            productService.add(product);
        }
    }

    public void updateProduct() {
        System.out.println("Sửa thông tin sản phẩm theo id: ");
        System.out.println("Nhập id sản phẩm cần thay đổi: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            System.out.println("Cập nhật lại tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Cập nhật lại số lượng sản phẩm: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Cập nhật lại giá tiền: ");
            double unitPrice = Double.parseDouble(scanner.nextLine());
            Product product = new Product(id, name, quantity, unitPrice);
            productService.update(product);
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("Sản phẩm không có!");
        }
    }

    public void removeProduct() {
        System.out.println("Nhập id sản phẩm cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            productService.deleteById(id);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không có sản phẩm cần tìm");
        }
    }

    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        System.out.println("--------------------------------------------ProductList Search----------------------------------------------------");
        System.out.printf("%-10s %-40s %-22s %-30s\n", "ID", "Tên sản phẩm", "Số lượng", "Giá sản phẩm");
        productService.searchByName(name);
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }


    public void displayProduct(List<Product> productList) {
        System.out.println("--------------------------------------------ProductList----------------------------------------------------");
        System.out.printf("%-10s %-40s %-22s %-30s\n", "ID", "Tên sản phẩm", "Số lượng", "Giá sản phẩm");
        for (Product product : productList) {
            System.out.printf("%-10s %-43s %-20s %-20s\n", product.getProductId(), product.getName(), product.getQuantity(),
                    num.format(product.getUnitPrice()));
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public void menuManager() {
        int choice = 0;
        do {
            System.out.println("❖◛◛◛◛◛◛◛◛◛◛◛◛ Menu Product Manager ◛◛◛◛◛◛◛◛◛◛◛◛❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "1. Thêm sản phẩm", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "2. Sửa sản phẩm", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "3. Tìm kiếm sản phẩm theo tên", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "4. Xóa sản phẩm theo id", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "5. Hiển thị toàn bộ sản phẩm", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "6. Hiển thị sản phẩm theo giá tiền giảm dần", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "7. Hiển thị sản phẩm theo giá tiền tăng dần ", "❖");
            System.out.printf("%-7s%-49s❖\n", "❖", "0. Để thoát chương trình", "❖");
            System.out.println("❖◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛❖");
            System.out.print("➥ ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    displayProduct(productService.printAll());
                    break;
                case 6:
                    displayProduct(productService.findAllByPriceDESC());
                    break;
                case 7:
                    displayProduct(productService.findALLByPriceASC());
                    break;
                case 0:
                    System.out.println("0. để thoát chương trình ");
                    break;
                default:
            }
        } while (choice != 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductViews that = (ProductViews) o;
        return quantity == that.quantity && Double.compare(that.unitPrice, unitPrice) == 0 && Objects.equals(productService, that.productService) && Objects.equals(currency, that.currency) && Objects.equals(num, that.num) && Objects.equals(scanner, that.scanner) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productService, currency, num, scanner, name, quantity, unitPrice);
    }
}
