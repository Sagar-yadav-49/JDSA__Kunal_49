package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
//        int[] nums={8,1,2,2,3};
//        int[] nums={6,5,4,8};
        int[] nums={7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(j!=i){
                    if(nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            ans[i]=count;
        }
        return ans;
    }

}