package ex5;

import java.util.Scanner;

public class TabulateSinX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input infinum: ");
        double inf = in.nextDouble();
        System.out.print("input supremum: ");
        double sup = in.nextDouble();
        System.out.print("input step: ");
        double step = in.nextDouble();

        if (inf < sup) {
            if (step > 0) {
                for (double i = inf; i <= sup; i = i + step) {
                    double x = i;
                    double znach = Math.sin(x);
                    System.out.printf("x = %f, sin(x) = %f \n", x, znach);
                }

            } else if (step < 0) {
                for (double i = sup; i >= inf; i = i + step) {
                    double x = i;
                    double znach = Math.sin(x);
                    System.out.printf("x = %f, sin(x) = %f \n", x, znach);
                }
            }
            else {
                System.out.println("ERROR");
            }
        }
        else if (inf > sup){
            double n = inf;
            inf = sup;
            sup = n;
            if (step > 0) {
                for (double i = inf; i <= sup; i = i + step) {
                    double x = i;
                    double znach = Math.sin(x);
                    System.out.printf("x = %f, sin(x) = %f \n", x, znach);
                }

            } else if (step < 0) {
                for (double i = sup; i >= inf; i = i + step) {
                    double x = i;
                    double znach = Math.sin(x);
                    System.out.printf("x = %f, sin(x) = %f \n", x, znach);
                }
            }
            else {
                System.out.println("ERROR");
            }
        }
        else {
            System.out.println("ERROR");
        }
    }
}
