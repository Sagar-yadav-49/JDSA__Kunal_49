package ArraysAndArrayList.Assignment;
// wrong
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num={2,1,5};
        int k=806;
        for(int ele:addToArrayForm(num,k)){
            System.out.print(ele);
        }

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        for (int i = num.length-1; i >=0 || k>0; i--) {
            if(i>=0){
                k+=num[i];
            }
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}