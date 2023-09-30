package ex4;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("input a: ");
        double a = in.nextDouble();
        System.out.print("input b: ");
        double b = in.nextDouble();
        System.out.print("input c: ");
        double c = in.nextDouble();

        double D = b*b-(4.0*a*c);

        if (D>0){
            System.out.println("we have 2 roots");
            double x1 = (-b+Math.sqrt(D))/(2.0*a);
            double x2 = (-b-Math.sqrt(D))/(2.0*a);
            System.out.printf("x1 = %f \n", x1);
            System.out.printf("x2 = %f \n", x2);
        }
        else if (D==0){
            System.out.println("we have 1 root");
            double x = -b/(2.0*a);
            System.out.printf("x = %f \n", x);
        }
        else {
            System.out.println("we don't have roots");
        }
    }
}
