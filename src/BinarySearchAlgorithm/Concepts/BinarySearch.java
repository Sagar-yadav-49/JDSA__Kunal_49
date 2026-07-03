package BinarySearchAlgorithm.Concepts;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numsAsc={-4,-2,6,9,11,12,14,20,36,48};
        int targetAsc=36;
        System.out.println(binarySearchAscending(numsAsc,targetAsc));
        int[] numsDes={90,75,18,12,6,4,3,1};
        int targetDes=75;
        System.out.println(binarySearchDescending(numsDes,targetDes));
    }
    // return the index of target element in the given array
    // return -1 if it doesn't exist
    static int binarySearchAscending(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            // int mid=(start+end)/2; // might be possible that (start+end) exceeds the range of int
            // better way to do is
            int mid=start+(end-start)/2; // it's just the same thing, (start+end)/2
            // how:- s+(e-s)/2= (2s+e-s)/2=(s+e)/2
            if(target<nums[mid]){ // if true, element is lies on the LHS
                end=mid-1;
            } else if (target>nums[mid]) { // if true, element is lies on the RHS
                start=mid+1;
            } else{ // target==nums[mid]
                // answer found
                return mid;
            }
        }
        // only executes if nothing has returned in the while loop, means element is not found
        return -1;
    }
    // what if array is sorted in descending order
    // what are the changes we required to make
    static int binarySearchDescending(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){ // if true, element is lies on the RHS
                start=mid+1;
            } else if (target>nums[mid]) { // if true, element is lies on the LHS
                end=mid-1;
            } else{ // target==nums[mid]
                // answer found
                return mid;
            }
        }
        // only executes if nothing has returned in the while loop, means element is not found
        return -1;
    }
}