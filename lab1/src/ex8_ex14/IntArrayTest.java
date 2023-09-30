package ex8_ex14;

import java.util.Scanner;

public class IntArrayTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Arr = new int[5];
        IntArray.newArr(Arr);
        IntArray.outArr(Arr);
        System.out.printf("sum of array elements = %d \n", IntArray.sumArr(Arr));
        System.out.printf("the number of even elements = %d \n", IntArray.evenArr(Arr));

        System.out.println("enter segment from...");
        int a = in.nextInt();
        System.out.println("to...");
        int b = in.nextInt();
        System.out.printf("elements belonging to the segment = %d \n", IntArray.segmentArr(Arr,a,b));

        if (IntArray.positiveArr(Arr)){
            System.out.println("All elements of Array is positive");
        }
        else {
            System.out.println("not all elements of Array is positive");
        }

        System.out.print("revers array: ");
        IntArray.reversArr(Arr);
        IntArray.outArr(Arr);
    }
}
