package ArraysAndArrayList.Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        // input elements in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // printing elements of array
        // 1.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // enhanced for loop "for each" loop
        // 2.
        for (int num :arr){ // for every element in the array, do something
            System.out.print(num +" "); // here num represents element of the array
        }
        // 3.
        // convert array into string and print that string
        System.out.println(Arrays.toString(arr));// internally its using for loop , so we don't have to use it

        // array of objects
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}