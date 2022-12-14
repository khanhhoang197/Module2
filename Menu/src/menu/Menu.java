package menu;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);


    public void menuForm() {
        int choice;
        do {
            System.out.println("❖◛◛◛◛◛◛◛◛◛◛◛◛MAIN MENU◛◛◛◛◛◛◛◛◛◛◛◛◛❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.printf("%s%26s%18s\n", "❖", "1.Đăng nhập", "❖");
            System.out.printf("%s%24s%20s\n", "❖", "2.Đăng ký", "❖");
            System.out.printf("%s%26s%18s\n", "❖", "3.Đăng xuất", "❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.println("❖◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛❖");
            System.out.print("➥ ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    System.out.println("Không cho đăng ký :)))");
                    break;
                case 3:
                    System.out.println("Tạm biệt");
                    System.exit(3);
                default:
                    System.out.println("Nhập sai. Vui lòng nhập lại !");
            }
        } while (true);

    }

    public void menuAdmin() {
        int choice;

        do {
            System.out.println("❐◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈❐");
            System.out.printf("%-44s❐\n", "❐");
            System.out.printf("%s%30s%14s\n", "❐", "1.Quản lý người dùng", "❐");
            System.out.printf("%s%28s%16s\n", "❐", "2.Quản lý hàng hóa", "❐");
            System.out.printf("%s%32s%12s\n", "❐", "3.Quản lý đơn đặt hàng", "❐");
            System.out.printf("%s%20s%24s\n", "❐", "4.Quay lại", "❐");
            System.out.printf("%s%17s%27s\n", "❐", "5.Thoát", "❐");
            System.out.printf("%-44s❐\n", "❐");
            System.out.println("❐◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈❐");
            System.out.print("➥ ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menuUser();
                    break;
                case 2:
                    menuGoods();
                    break;
                case 3:
                    menuOder();
                    break;
                case 4:
                    menuForm();
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    System.exit(5);
                default:
                    System.out.println("Nhập sai");
                    break;

            }
        } while (true);
    }

    public void menuUser() {
        int choice;
        do {
            System.out.println("웃▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬웃");
            System.out.printf("%-42s✉▋웃\n", "웃▋✆");
            System.out.printf("%s%30s%14s\n", "웃▋", "1.Thêm người dùng", "▋웃");
            System.out.printf("%s%29s%15s\n", "웃▋", "2.Sửa người dùng", "▋웃");
            System.out.printf("%s%29s%15s\n", "웃▋", "3.Xóa người dùng", "▋웃");
            System.out.printf("%s%23s%21s\n", "웃▋", "4.Quay lại", "▋웃");
            System.out.printf("%s%20s%24s\n", "웃▋", "5.Thoát", "▋웃");
            System.out.printf("%-42s☎▋웃\n", "웃▋✍");
            System.out.println("웃▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬웃");
            System.out.print("➥ ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Thêm người dùng");
                    break;
                case 2:
                    System.out.println("sửa người dùng");
                    break;
                case 3:
                    System.out.println("xoa người dùng");
                    break;
                case 4:
                    menuAdmin();
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    System.exit(5);
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        } while (true);
    }

    public void menuGoods() {
        int choice;

        do {
            System.out.println("�◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘�");
            System.out.printf("%-43s❂�\n", "�❂");
            System.out.printf("%s%30s%15s\n", "�", "1.Thêm sản phẩm", "�");
            System.out.printf("%s%29s%16s\n", "�", "2.Sửa sản phẩm", "�");
            System.out.printf("%s%29s%16s\n", "�", "3.Xóa sản phẩm", "�");
            System.out.printf("%s%25s%20s\n", "�", "4.Quay lại", "�");
            System.out.printf("%s%22s%23s\n", "�", "5.Thoát", "�");
            System.out.printf("%-43s❂�\n", "�❂");
            System.out.println("�◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘�");
            System.out.print("➥ ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Thêm sản phẩm");
                    break;
                case 2:
                    System.out.println("sửa sản phẩm");
                    break;
                case 3:
                    System.out.println("xóa sản phẩm");
                    break;
                case 4:
                    menuAdmin();
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    System.exit(5);
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        } while (true);
    }

    public void menuOder() {
        int choice;

        do {
            System.out.println("✬⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿✬");
            System.out.printf("%-43sდ✬\n", "✬დ");
            System.out.printf("%s%30s%15s\n", "✬", "1.Thêm đơn hàng", "✬");
            System.out.printf("%s%29s%16s\n", "✬", "2.Sửa đơn hàng", "✬");
            System.out.printf("%s%29s%16s\n", "✬", "3.Xóa đơn hàng", "✬");
            System.out.printf("%s%25s%20s\n", "✬", "4.Quay lại", "✬");
            System.out.printf("%s%22s%23s\n", "✬", "5.Thoát", "✬");
            System.out.printf("%-43sდ✬\n", "✬დ");
            System.out.println("✬⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿✬");
            System.out.print("➥ ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Thêm đơn hàng");
                    break;
                case 2:
                    System.out.println("sửa đơn hàng");
                    break;
                case 3:
                    System.out.println("xóa đơn hàng");
                    break;
                case 4:
                    menuAdmin();
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    System.exit(5);
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuForm();

    }
}
