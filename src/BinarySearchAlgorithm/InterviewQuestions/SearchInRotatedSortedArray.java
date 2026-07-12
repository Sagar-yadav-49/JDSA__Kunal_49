package BinarySearchAlgorithm.InterviewQuestions;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2}; // 1st half is sorted, 4<5<6<7 , 2nd half is not sorted 7>0<1<2
        // so apply binary search on the sorted half otherwise search in another half
        int target=0;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
            int mid = start + ((end - start) / 2);
            if (target == nums[mid]) {
                return mid;
            }
            // otherwise, determine which half is sorted, bcoz among the two half , one half is always sorted infact after rotation
            if (nums[start] <= nums[mid]) { // left half is sorted
                if(target>=nums[start] && target <nums[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            } else{
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}