package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class BuildArrayFromPermutations {
    public static void main(String[] args) {
//        int[] nums={0,2,1,5,3,4};
        int[] nums={5,0,1,2,3,4};

//        int[] ans1=buildArray(nums);
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}