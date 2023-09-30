package ex7;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class CalcExpByTaylorSeriesExpansion {
    public static void main(String[] args) {
        double n = 1;
        double fact = 1, sum = 1;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter eps: ");
        double eps = in.nextDouble();
        eps = pow(0.1, eps);

        while (abs((pow(x, n)/fact))>eps){
            sum+=pow(x, n)/fact;
            n++;
            fact*=(n);
        }
        System.out.println(sum);
    }
}
