package demoFruit;

import java.util.ArrayList;
import java.util.List;

public class Farmer implements ICamProvideable {
    private boolean isPartner;

    public List<Fruit> cams = new ArrayList<>();

    public Farmer(boolean isPartner) {
        cams.add(new Cam(true));
        cams.add(new Cam(false));
        cams.add(new Cam(true));
        cams.add(new Cam(true));
        this.isPartner = isPartner;
    }

    public List<Fruit> getFruits() {
        return cams;
    }

    public boolean isPartner() {
        return isPartner;
    }
}
