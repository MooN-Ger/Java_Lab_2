package ex15_ex18;

import ex15_ex18.seminar1.Triangles;

public class AllTests {
    public static void main(String[] args) {
        Point3D point_1 = new Point3D(1, 2, 3);
        Point3D point_2 = new Point3D(2, 0, 0);

        point_1.show_p();
        point_2.show_p();

        boolean res1 = Point3D.getEquals(point_1,point_2);
        System.out.println("Point equality: " + res1);

        Vector3D vector_1 = new Vector3D(point_1, point_2);
        Vector3D vector_2 = new Vector3D(1, 2, 3);

        vector_1.show_v();
        vector_2.show_v();

        System.out.println("Vector1 length = " + vector_1.vecLength());
        System.out.println("Vector2 length = " + vector_2.vecLength());

        boolean res2 = Vector3D.getEquals(vector_1, vector_2);
        System.out.println("Vector equality: " + res2);

        System.out.print("Sum of vectors: ");
        Vector3D sumVector = Vector3DProcessor.sum_vec(vector_1, vector_2);
        sumVector.show_v();

        Vector3D diffVector1 = Vector3DProcessor.diff_vec(vector_1, vector_2);
        Vector3D diffVector2 = Vector3DProcessor.diff_vec(vector_2, vector_1);
        System.out.print("Vector difference case №1: ");
        diffVector1.show_v();
        System.out.print("Vector difference case №2: ");
        diffVector2.show_v();

        System.out.println("Scalar product = " + Vector3DProcessor.productS_vec(vector_1, vector_2));

        Vector3D productV_vector = Vector3DProcessor.productV_vec(vector_1, vector_2);
        System.out.print("Vector product: ");
        productV_vector.show_v();

        System.out.println("Vector collinearity: " + Vector3DProcessor.collinearity_vec(vector_1, vector_2));

        System.out.println("Distance between two points = " + Point3D.pointDistance(point_1, point_2));

        Point3D point_3 = new Point3D(0, 1, 0);

        Triangles triangle_1 = new Triangles(point_1, point_2, point_3);

        System.out.print("The area of the triangle = ");
        System.out.println(triangle_1.Area_triangle());
        System.out.print("The perimeter of the triangle = ");
        System.out.println(triangle_1.Perimeter_triangle());
        System.out.print("Median point: ");
        Point3D median_point = triangle_1.Median_point();
        median_point.show_p();

        Vector3DArray Arr_1 = new Vector3DArray(5);
        Arr_1.change_elem(vector_2);
        System.out.println(Arr_1.arr_length());
        Arr_1.show_arr();
        System.out.println(Arr_1.most_vec_length());
        System.out.println(Arr_1.find_vec(vector_2));
        Arr_1.sum_array().show_v();
        double[] Num_Arr = {1,2,3,4,5};
        Arr_1.linCombOfVec(Num_Arr).show_v();
        Arr_1.pointShiftByVec(point_1);
    }
}
