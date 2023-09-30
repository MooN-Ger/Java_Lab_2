package ex15_ex18;

public class Vector3DProcessor {
    public static Vector3D sum_vec(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getX_vec() + vector2.getX_vec(), vector1.getY_vec() + vector2.getY_vec(), vector1.getZ_vec() + vector2.getZ_vec());
    }

    public static Vector3D diff_vec(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getX_vec() - vector2.getX_vec(), vector1.getY_vec() - vector2.getY_vec(), vector1.getZ_vec() - vector2.getZ_vec());
    }

    public static double productS_vec(Vector3D vector1, Vector3D vector2) {
        double productS_vector = vector1.getX_vec() * vector2.getX_vec() + vector1.getY_vec() * vector2.getY_vec() + vector1.getZ_vec() * vector2.getZ_vec();
        return productS_vector;
    }

    public static Vector3D productV_vec (Vector3D vector1, Vector3D vector2) {
        return new Vector3D (vector1.getY_vec() * vector2.getZ_vec() - vector1.getZ_vec() * vector2.getY_vec(), vector1.getZ_vec() * vector2.getX_vec() - vector1.getX_vec() * vector2.getZ_vec(), vector1.getX_vec() * vector2.getY_vec() - vector1.getY_vec() * vector2.getX_vec());
    }

    public static boolean collinearity_vec(Vector3D v1, Vector3D v2) {
        Vector3D col_vec = productV_vec(v1, v2);
        if ((col_vec.getX_vec()==0)&&(col_vec.getY_vec()==0)&&(col_vec.getZ_vec()==0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
