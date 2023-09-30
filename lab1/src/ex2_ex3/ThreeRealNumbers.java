package ex2_ex3;

import java.util.Scanner;
public class ThreeRealNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        float num1 = in.nextFloat();
        System.out.print("Input a number 2: ");
        float num2 = in.nextFloat();
        System.out.print("Input a number 3: ");
        float num3 = in.nextFloat();

        float pr = num1*num2*num3;
        float avg = (num1+num2+num3)/3;

        float[] myArray = new float[3];

        myArray[0]=num1;
        myArray[1]=num2;
        myArray[2]=num3;

        boolean sorted = false;
        float temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i+1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.printf("Your numbers: %f, %f, %f \n", num1, num2, num3);
        System.out.printf("product = %f \n", pr);
        System.out.printf("avg = %f \n", avg);

        for (int i = 0; i < 3; i++) {
            System.out.println(myArray[i]);
        }

        in.close();
    }

}

