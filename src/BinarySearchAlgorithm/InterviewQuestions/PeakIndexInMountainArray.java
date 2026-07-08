package BinarySearchAlgorithm.InterviewQuestions;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if(arr[mid]>arr[mid+1]){
                // you are in the descending part of array
                // this may be the answer but look in the left
                // this is why end!=mid-1
                end=mid;
            } else if (arr[mid]<arr[mid+1]) {
                // you are in the ascending part of array
                // bcoz, we know that mid+1>mid, hence we're ignoring start=mid
                start=mid+1;
            } else{
                return mid;
            }
            // in the end, start==end and pointing to the largest element bcoz of the two checks above
            // start and end trying to find the max element in the above 2 checks
            // hence, when they are pointing to just one element, that is the max element , bcoz, this is what checks says
        }
        return start; // or return end; // as both are equal
    }
}