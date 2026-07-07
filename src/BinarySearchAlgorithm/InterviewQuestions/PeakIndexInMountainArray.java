package BinarySearchAlgorithm.InterviewQuestions;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,15,8,2,4,9};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(mid>0){
            if(arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]<arr[mid-1]) {
                end=mid-1;
            } else {
                start = mid + 1;
            }
            }
        }
        return -1;
    }
}