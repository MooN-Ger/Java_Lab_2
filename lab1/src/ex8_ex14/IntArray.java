package ex8_ex14;

import java.util.Scanner;

public class IntArray {
    public static void outArr (int[] Arr){
        for (int Value: Arr){
            System.out.print(Value + " ");
        }
        System.out.println();
    }

    public static void newArr(int[] Arr){
        Scanner in = new Scanner(System.in);
        System.out.println("enter array elements: ");
        for (int i = 0; i < Arr.length; i++){
            Arr[i] = in.nextInt();
        }
    }

    public static int sumArr(int[] Arr){
        int sum = 0;
        for (int Value: Arr){
            sum += Value;
        }
        return sum;
    }
    public static int evenArr(int[] Arr){
        int count_even = 0;
        for (int Value: Arr){
            if (Value%2==0){
                count_even++;
            }
        }
        return count_even;
    }

    public static int segmentArr(int[] Arr, int a, int b){
        int count_seg = 0;
        for (int Value: Arr){
            if ((Value>=a) && (Value<=b)){
                count_seg++;
            }
        }
        return count_seg;
    }

    public static boolean positiveArr (int[] Arr){
        boolean t = true;
        for (int Value: Arr){
            if (Value<=0){
                t = false;
                break;
            }
            else {
                t = true;
            }
        }
        return (t);
    }

    public static void reversArr (int[] Arr){
        for (int i = 0; i <Arr.length/2; i++){
            int tmp = Arr[i];
            Arr[i] = Arr[Arr.length-i-1];
            Arr[Arr.length-i-1] = tmp;
        }
    }
}
