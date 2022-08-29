package demoFruit;
import java.util.ArrayList;
import java.util.List;

public class IT implements ICamProvideable{
    @Override
    public boolean isPartner() {
        return true;
    }

    @Override
    public List<Fruit> getFruits() {
        List<Fruit> cams = new ArrayList<>();
        cams.add(new Cam(true));
        cams.add(new Cam(false));
        cams.add(new Cam(true));
        cams.add(new Cam(false));
        return cams;
    }
}
