package BinarySearchAlgorithm.InterviewQuestions;
// for unique elements
public class RotationCount {
    public static void main(String[] args) {
//        int nums[]={1,2,4,5,7};
        int nums[]={3,4,5,1,2};
        System.out.println(findRotationCount(nums));
    }
    static int findRotationCount(int[] nums){
        int start=0;
        int end=nums.length-1;
        int min=Integer.MAX_VALUE;
        int index=-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(nums[start]<=nums[end]){
                if(nums[start]<min){
                    index=start;
                    min=nums[start];
                }
                break;
            }
            // if left half is sorted
            if(nums[start]<=nums[mid]){
                if(nums[start]<min){
                    index=start;
                    min=nums[start];
                }
                start=mid+1;
            }
            else{
                if(nums[mid]<min){
                    index=mid;
                    min=nums[start];
                }
                end=mid-1;
            }
        }
        return index;
    }

}