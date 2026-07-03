package LinearSearchAlgorithm.Concept;

public class Main {
    public static void main(String[] args) {
        int[] nums={2,23,1,5,28,-1,-3,-100,50};
        int target=28;
        System.out.println(linearSearch(nums,target));
    }
    // search the target and return the index
//    static int linearSearch(int[] nums, int target){
//        if(nums.length==0){
//            return -1;
//        }
//        for (int i= 0; i<nums.length; i++) {
//            if(nums[i]== target){
//                return i;
//            }
//        }
//        // this line will execute if none of the statement above have executed
//        // hence the target is not found
//        return -1;
//    }

    // search the target and return the element
//    static int linearSearch(int[] nums, int target){
//        if(nums.length==0){
//            return -1;
//        }
//        for (int ele: nums){
//            if(ele == target){
//                return ele;
//            }
//        }
//        return Integer.MAX_VALUE; // here we're not returning -1, bcoz -1 might be one of the element in the array
    // and in above function we are returning -1, bcoz we know -1 cannot be an index
//    }


    // search the target and return true or false
    static boolean linearSearch(int[] nums, int target){
        if(nums.length==0){
            return false;
        }
        for (int ele: nums){
            if(ele == target){
                return true;
            }
        }
        return false;
    }
}