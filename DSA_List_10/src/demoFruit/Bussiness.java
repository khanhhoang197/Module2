package demoFruit;

import java.util.ArrayList;
import java.util.List;

public class Bussiness implements ICamProvideable {
    @Override
    public boolean isPartner() {
        return true;
    }

    @Override
    public List<Fruit> getFruits() {
        List<Fruit> duas = new ArrayList<>();
        duas.add(new Dua(true));
        duas.add(new Dua(false));
        duas.add(new Dua(true));
        duas.add(new Dua(false));
        return duas;
    }
}
