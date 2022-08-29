package demoFruit;

public class Main {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        ICamProvideable[] providers = {
                new FarmerCampuchia(true),
                new Bussiness(),
        };
        for (ICamProvideable provider : providers) {
            fruitFactory.importFruit(provider);
        }

    }
}
