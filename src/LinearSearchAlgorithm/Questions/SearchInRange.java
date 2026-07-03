package LinearSearchAlgorithm.Questions;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={2,23,1,5,28,-1,-3,-100,50};
        int target=-1;
        System.out.println(search(nums,target,1,5));
    }
    static int search(int[] nums, int target, int start, int end){
        if(nums.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}