package BinarySearchAlgorithm.InterviewQuestions;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target=3;
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(nums[mid]==target){
                return true;
            }
            // condition for trim / shrink the search space
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start+=1;
                end-=1;
                continue; // might be the same condition at other indices, so repeat the process
            }
            // left array is sorted
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }
            // right array is sorted
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}