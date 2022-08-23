package comparable;

import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    private String color;
    private boolean filled;

    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius);
        this.color = color;
        this.filled = filled;
    }

    @Override
    public int compareTo(ComparableCircle o){
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
