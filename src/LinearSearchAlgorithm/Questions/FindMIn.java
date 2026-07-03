package LinearSearchAlgorithm.Questions;

public class FindMIn {
    public static void main(String[] args) {
        int[] nums={2,23,1,5,28,-1,-3,-100,50};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums){
        if(nums.length==0){
            return -1;
        }
//        int min=Integer.MAX_VALUE;

        int min=nums[0]; // // assume if arr.length!=0
        // using for-each loop
//        for (int ele:nums){
//            if(ele<min){
//                min=ele;
//            }
//        }
        // using standard for loop
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}