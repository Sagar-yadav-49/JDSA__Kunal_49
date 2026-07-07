package BinarySearchAlgorithm.InterviewQuestions;

public class PositionOfAnElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30,31};
        int target=15;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            // double the box value
            // end= previous End + sizeofbox*2
            // size of box= end-start+1
            end=end+(((end-start)+1)*2);
            start=newStart;
        }
        return searchInfiniteArray(arr,target, start,end);
    }
    static int searchInfiniteArray(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}