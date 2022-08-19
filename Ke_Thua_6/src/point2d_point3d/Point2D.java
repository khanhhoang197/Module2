package point2d_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y=y;
    }
    public float[] getXY(){
        float[] Array = {this.x, this.y};
        return Array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x = " + getX() +
                ", y = " + getY() +
                '}';
    }

    public static void main(String[] args) {
        Point2D ardeo2d = new Point2D();
        System.out.println(ardeo2d);

        ardeo2d = new Point2D(10,50);
        System.out.println(ardeo2d);
    }
}
