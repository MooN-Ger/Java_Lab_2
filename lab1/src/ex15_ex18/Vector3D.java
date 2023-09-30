package ex15_ex18;

public class Vector3D {
    private double x_vec, y_vec, z_vec;

    public Vector3D() {
        this.x_vec = 0;
        this.y_vec = 0;
        this.z_vec = 0;
    }

    public Vector3D(Point3D point1, Point3D point2) {
        this.x_vec = point2.getX() - point1.getX();
        this.y_vec = point2.getY() - point1.getY();
        this.z_vec = point2.getZ() - point1.getZ();
    }

    public Vector3D(double x_vec, double y_vec, double z_vec) {
        this.x_vec = x_vec;
        this.y_vec = y_vec;
        this.z_vec = z_vec;
    }

    public double getX_vec() { return x_vec; }
    public double getY_vec() { return y_vec; }
    public double getZ_vec() { return z_vec; }

    public void setX_vec(double x_vec) { this.x_vec = x_vec; }
    public void setY_vec(double y_vec) { this.y_vec = y_vec; }
    public void setZ_vec(double z_vec) { this.z_vec = z_vec; }

    public void show_v(){
        System.out.println("vector coordinates: " + (x_vec) + ";  " + (y_vec) + ";  " + (z_vec));
    }

    public double vecLength () {
        double vec_length = Math.sqrt(x_vec * x_vec + y_vec * y_vec + z_vec * z_vec);
        return vec_length;
    }

    public static boolean getEquals(Vector3D vector1, Vector3D vector2) {
        if ((vector1.x_vec == vector2.x_vec) && (vector1.y_vec == vector2.y_vec) && (vector1.z_vec == vector2.z_vec)) {
            return true;
        }
        else {
            return false;
        }
    }
}
