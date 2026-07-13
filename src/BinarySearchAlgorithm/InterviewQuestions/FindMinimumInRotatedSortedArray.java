package BinarySearchAlgorithm.InterviewQuestions;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
//        int start=0;
//        int end=nums.length-1;
//        int min=Integer.MAX_VALUE;
//        while(start<=end){
//            int mid=start+((end-start)/2);
//            // left half is sorted
//            if(nums[start]<=nums[mid]){
//                min=Integer.min(min,nums[start]);
//                start=mid+1;
//            }
//            // right half is sorted
//            else{
//                min=Integer.min(min,nums[mid]);
//                end=mid-1;
//            }
//        }
//        return min;


        // optimized Approach
        int start=0;
        int end=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(nums[start]<=nums[end]){
                min=Integer.min(min,nums[start]);
                break;
            }
            // left half is sorted
            if(nums[start]<=nums[mid]){
                min=Integer.min(min,nums[start]);
                start=mid+1;
            }
            // right half is sorted
            else{
                min=Integer.min(min,nums[mid]);
                end=mid-1;
            }
        }
        return min;




        //

//        int start=0;
//        int end=nums.length-1;
//        while(start<=end) {
//            int mid = start + ((end - start) / 2);
//            if (nums[mid] > nums[end]) {
//                start = mid + 1;
//            } else {
//                end = mid;
//            }
//            if (nums[start] == nums[mid]) {
//                return nums[start];
//            }
//        }
//        return -1;

    }
}