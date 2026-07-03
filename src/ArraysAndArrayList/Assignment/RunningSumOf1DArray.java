package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
//        int[] nums={3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int[] runningSum=new int[nums.length];
        for (int i = 0; i < runningSum.length; i++) {
            if(i==0){
                runningSum[i]=nums[i];
            } else {
                sum += nums[i];
                runningSum[i] = nums[0] + sum;
            }
        }
        return runningSum;
    }
}