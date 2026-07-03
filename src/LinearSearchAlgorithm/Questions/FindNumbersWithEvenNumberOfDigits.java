package LinearSearchAlgorithm.Questions;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
//        int[] nums={12,345,2,6,7896};
//        int[] nums={555,901,482,1771};
        int[] nums={0,124,9,1764,98,1};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            int digit=0;
            if(nums[i]<0){
                nums[i]*=-1;
            } else if(nums[i]==0){
                digit=1;
            }
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}