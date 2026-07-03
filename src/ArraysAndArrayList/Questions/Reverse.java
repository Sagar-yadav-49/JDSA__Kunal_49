package ArraysAndArrayList.Questions;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,5,9,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    // 2-pointer method
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    // with the help of swap function
    static void swap(int[] arr, int index1, int index2){
        int temp2=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp2;
    }
}