package ex15_ex18;

public class Point3D {
    private double x, y, z;

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void show_p() {
        System.out.println("x = " + x + "; y = " + y + "; z = " + z);
    }

    public static boolean getEquals(Point3D point1, Point3D point2) {
        if ((point1.getX()!=point2.getX())||(point1.getY()!=point2.getY())||(point1.getZ()!=point2.getZ())){
            return false;
        }
        else {
            return true;
        }
    }

    public static double pointDistance (Point3D point1, Point3D point2) {
        double p_dist = Math.sqrt(Math.pow(point2.getX()-point1.getX(),2) + Math.pow(point2.getY()-point1.getY(),2) + Math.pow(point2.getZ()-point1.getZ(),2));
        return p_dist;
    }
}
