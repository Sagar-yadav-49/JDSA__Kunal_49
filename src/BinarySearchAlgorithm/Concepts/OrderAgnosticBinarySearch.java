package BinarySearchAlgorithm.Concepts;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr={-4,-2,6,9,11,12,14,20,36,48};
        int[] arr={99,80,75,22,11,10,5,2,-3};
        int target=22;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        // find whether the array is sorted in ascending and descending
//        boolean isAsc;
//        if(arr[start]<arr[end]){
//            isAsc=true;
//        } else{
//            isAsc=false;
//        }
        // simple way
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            // this condition checking is common to both case
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            } else{
                if(target<arr[mid]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}