package ex15_ex18.seminar1;

import ex15_ex18.Point3D;
import ex15_ex18.Vector3D;
import ex15_ex18.Vector3DProcessor;

public class Triangles {
    private Point3D p1, p2, p3;
    private Vector3D productV_vector, vector_triangle_1, vector_triangle_2, vector_triangle_3;

    public Triangles () {

    }

    public Triangles(Point3D p1, Point3D p2, Point3D p3) {

        vector_triangle_1 = new Vector3D(p1, p2);
        vector_triangle_2 = new Vector3D(p1, p3);
        vector_triangle_3 = new Vector3D(p2, p3);

        this.productV_vector = Vector3DProcessor.productV_vec(vector_triangle_1, vector_triangle_2);
        if (productV_vector.vecLength()!=0) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
        else {
            System.out.println("ERROR: Triangle doesn't exist");
        }

    }


    public double Area_triangle () {
        return (0.5*productV_vector.vecLength());
    }

    public double Perimeter_triangle () {
        return (vector_triangle_1.vecLength() + vector_triangle_2.vecLength() + vector_triangle_3.vecLength());
    }

    public Point3D Median_point () {
        return new Point3D((p1.getX() + p2.getX() + p3.getX())/3, (p1.getY() + p2.getY() + p3.getY())/3, (p1.getZ() + p2.getZ() + p3.getZ())/3);
    }
}
