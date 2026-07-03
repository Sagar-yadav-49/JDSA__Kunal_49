package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
//        int[] nums={2,5,1,3,4,7};
//        int[] nums={1,2,3,4,4,3,2,1};
        int[] nums={1,1,2,2};
//        System.out.println(Arrays.toString(shuffle(nums,3)));
//        System.out.println(Arrays.toString(shuffle(nums,4)));
        System.out.println(Arrays.toString(shuffle(nums,2)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newArr=new int[nums.length];
        for (int i = 0; i < n; i++) {
            newArr[i*2]=nums[i];
            newArr[(i*2)+1]=nums[i+n];

        }
        return newArr;
    }
}