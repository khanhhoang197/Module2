package fan;

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public void setOn() {
        this.on = on;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public Fan(int speed, double radius, boolean on, String color) {
        this.speed = speed;
        this.radius = radius;
        this.on = on;
        this.color = color;
    }

    @Override
    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("\nSpeed: " + this.speed);
        } else {
            state += ("Fan is off ");
        }
        state += ("\nColor: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
}
