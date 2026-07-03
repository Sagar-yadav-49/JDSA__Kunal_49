package ArraysAndArrayList.Questions;

import java.util.Arrays;

public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,226,33};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        // if array can be empty
        int max= Integer.MIN_VALUE; // give the minimum value as max "-2147483648"
        // if array is not empty, it can work with this:-
//        int max=arr[0];

        // simple for loop
//        for (int i= 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
        // enhanced for loop
        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
        }

        // find maximum element in the range(0 to 4)
        // or we can pass in the function paramter
        // static void max(int[]arr, int start, int end)
        // {

        // }
//        for (int i= 0; i < 5; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
        return max;
    }

}