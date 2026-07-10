package ArraysAndArrayList.Assignment;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,5,2};
        int target=2;
        System.out.println(searchInMountainArray(arr, target));
    }
    static int searchInMountainArray(int[] arr,int target){
        int peakIdx=findPeakElement(arr);
        int firstTry=orderAgnosticBS(arr, target, 0, peakIdx);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peakIdx+1, arr.length-1);

    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if(nums[mid]>nums[mid+1]){
                end=mid;
            } else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            // this condition checking is common to both case
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            } else{
                if(target<arr[mid]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}