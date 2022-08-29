package demoFruit;

import java.util.List;

public class FruitFactory {
    public void importFruit(ICamProvideable provider) {
        if (!provider.isPartner()) {
            System.out.println("Bạn không phải đối tác");
            System.out.println("Say Good bye");
            return;
        }
        List<Fruit> fruits = provider.getFruits();
        if (provider.getFruits().size() <= 0) {
            System.out.println("Đi về trông fruit đi");
            return;
        }
        for (Fruit fruit : fruits) {
            if (!fruit.isCertificated()) {
                System.out.println(fruit.getClass()
                        .getSimpleName() + " ko đạt tiêu chuẩn");
                return;
            }
        }
        System.out.println("Kiểm tra cam hoàn thành");
        System.out.println("Chuyển qua cho bộ xử lý fruit");
    }

}
