package ConditionalAndLoops.Assignment.Basic;

// Q. LeetCode, subtract the product and sum of digits of an integer
import java.util.Scanner;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n){
        int product=1;
        int sum=0;
        int r=0;
        while(n>0){
            r=n%10;
            n=n/10;
            product*=r;
            sum+=r;
        }
        int result=product-sum;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        subtractProductAndSum(4421);

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int r=0;
//        int product=1;
//        int sum=0;
//        while(n>0){
//            r=n%10;
//            n=n/10;
//            product*=r;
//            sum+=r;
//        }
//        System.out.println(product);
//        System.out.println(sum);
//        int result=product-sum;
//        System.out.println(result);

    }
}