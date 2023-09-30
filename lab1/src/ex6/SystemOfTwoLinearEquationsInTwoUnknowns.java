package ex6;

import java.util.Scanner;

public class SystemOfTwoLinearEquationsInTwoUnknowns {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a1, b1, s1: ");
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double s1 = in.nextDouble();
        System.out.println("enter a2, b2, s2: ");
        double a2 = in.nextDouble();
        double b2 = in.nextDouble();
        double s2 = in.nextDouble();

        double det = (a1*b2)-(a2*b1);
        double det_x = (s1*b2)-(s2*b1);
        double det_y = (a1*s2)-(a2*s1);

        if (det != 0) {
            double x = det_x/det;
            double y = det_y/det;
            System.out.printf("x = %f \n", x);
            System.out.printf("y = %f \n", y);
        }
        else {
            if ((det_x != 0)&&(det_y !=0 )){
                System.out.println("The system is incompatible");
            }
            else{
                System.out.println("The system has infinitely many solutions");
            }
        }
    }
}
