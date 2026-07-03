package LinearSearchAlgorithm.Questions;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] nums={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,11}
        };
        System.out.println(max(nums));
    }
    static int max(int[][] nums){
        int max=nums[0][0];
        for (int row = 0; row < nums.length; row++) {
            for (int col = 1; col < nums[row].length; col++) {
                if(nums[row][col]>max){
                    max=nums[row][col];
                }
            }
        }
        return max;
    }
}