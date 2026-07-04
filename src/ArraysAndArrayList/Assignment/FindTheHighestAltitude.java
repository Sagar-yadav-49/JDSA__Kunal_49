package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
//        int[] gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int highestAltitude=0;
        int[] altitudes=new int[gain.length+1];
        altitudes[0]=0;
        for (int i = 1; i <= gain.length; i++) {
            altitudes[i]=altitudes[i-1]+gain[i-1];
        }
        System.out.println(Arrays.toString(altitudes));
        return max(altitudes);
    }
    static int max(int[] altitudes){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < altitudes.length; i++) {
            if(altitudes[i]>max){
                max=altitudes[i];
            }
        }
        return max;
    }
}