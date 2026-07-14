package BinarySearchAlgorithm.InterviewQuestions;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int firstTrueIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (nums[mid] != nums[mid ^ 1]) {

                firstTrueIndex = mid;
                right = mid - 1;
            } else {

                left = mid + 1;
            }
        }

        return nums[firstTrueIndex];
    }
}