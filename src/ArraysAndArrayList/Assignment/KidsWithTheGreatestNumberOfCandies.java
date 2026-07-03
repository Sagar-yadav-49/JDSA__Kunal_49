package ArraysAndArrayList.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
//        int[] candies ={2,3,5,1,3};
//        int[] candies ={4,2,1,1,2};
        int[] candies ={12,1,12};
        int extraCandies=10;
        for(Boolean ele:kidsWithCandies(candies,extraCandies)){
            System.out.print(ele+" ");
        }

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if((candies[i]+extraCandies)>=max(candies)){
                result.add(true);
            } else{
                result.add(false);
            }
        }
        return result;

    }
    public static int max(int[] candies){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }
}