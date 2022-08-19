package point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = {super.getX(),super.getY(),this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{"
                + "x = "
                + getX()
                + "y = "
                +getY()
                + "z = "
                + getZ() +
                '}';
    }

    public static void main(String[] args) {
        Point3D ar3d = new Point3D();
        System.out.println(ar3d);

        ar3d = new Point3D(10,20,30);
        System.out.println(ar3d);
    }
}
