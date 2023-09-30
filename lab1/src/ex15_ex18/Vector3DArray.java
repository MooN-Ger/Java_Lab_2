package ex15_ex18;

public class Vector3DArray {
    private Vector3D[] Arr;

    public Vector3DArray(int size) {
        Arr = new Vector3D[size];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = new Vector3D();
        }
    }

    public void show_arr () {
        for (Vector3D Value: Arr) {
            Value.show_v();
        }
    }

    public int arr_length() {
        return Arr.length;
    }

    public void change_elem(Vector3D vec) {
        int change_elem = 3;
        for (int i = 0; i < Arr.length; i++) {
            if (i == change_elem) {
                Arr[i] = vec;
            }
        }
    }

    public double most_vec_length() {
        double most_vec_length = 0;
        for (Vector3D Value: Arr) {
            if (Value.vecLength() > most_vec_length) {
                most_vec_length = Value.vecLength();
            }
        }
        return most_vec_length;
    }

    public int find_vec (Vector3D vec) {
        int k = -1;
        for (int i = 0; i < Arr.length; i++) {
            if (Vector3D.getEquals(Arr[i], vec) == true) {
                k = i;
                break;
            }
        }
        return k;
    }

    public Vector3D sum_array () {
        Vector3D sum_vec = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            sum_vec = Vector3DProcessor.sum_vec(sum_vec, Arr[i]);
        }
        return sum_vec;
    }


    public Vector3D linCombOfVec(double[] Num_Arr) {
        Vector3D lin_comb_vec = new Vector3D();
        if (Num_Arr.length == Arr.length) {
            for (int i = 0; i < Arr.length; i++) {
                Arr[i] = new Vector3D(Arr[i].getX_vec() * Num_Arr[i], Arr[i].getY_vec() * Num_Arr[i], Arr[i].getZ_vec() * Num_Arr[i]);
                lin_comb_vec =  Vector3DProcessor.sum_vec(lin_comb_vec, Arr[i]);
            }
        }
        else {
            lin_comb_vec = new Vector3D();
        }
        return lin_comb_vec;
    }

    public void pointShiftByVec(Point3D point) {
        Point3D[] ArrP = new Point3D[Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            ArrP[i] = new Point3D (Arr[i].getX_vec() + point.getX(), Arr[i].getY_vec() + point.getY(), Arr[i].getZ_vec() + point.getZ());
        }
        for (int i = 0; i < ArrP.length; i++) {
            ArrP[i].show_p();
        }
    }
}
