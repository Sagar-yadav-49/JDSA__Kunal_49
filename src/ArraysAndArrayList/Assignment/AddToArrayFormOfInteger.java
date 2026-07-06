package ArraysAndArrayList.Assignment;
// wrong
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        int k=34;
        for(int ele:addToArrayForm(num,k)){
            System.out.print(ele);
        }
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for (int i = num.length-1; i >0 ; i--) {
            sum=num[i]+(k%10);
            list.add(0,sum%10);
            k=sum/10;
        }
        while (k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }
        return list;
    }
}