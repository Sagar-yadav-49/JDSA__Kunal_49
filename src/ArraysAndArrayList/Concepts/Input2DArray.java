package ArraysAndArrayList.Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println(arr.length); // 3 // give no. of rows

//        int[][] arr2=new int[3][10];
//        System.out.println(arr2.length); // 3

        // input for 2D array
        // outer for-loop is iterating every row
        for (int row = 0; row < arr.length; row++) {
            // for every row iam iterating every column using another for-loop
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=sc.nextInt();
            }
        }

        // output, printing
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // Arrays.toString()
        // for loop
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // for-each loop(enhanced for loop)
        for (int[] ele:arr) {
            System.out.println(Arrays.toString(ele));
        }
    }
}