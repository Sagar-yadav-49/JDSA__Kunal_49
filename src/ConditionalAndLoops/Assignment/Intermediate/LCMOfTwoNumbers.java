package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // simple but not optimised
//        int max=Math.max(a,b);
//        int lcm=0;
//        for (int i= max; i <=a*b; i++) {
//            if(i%a==0 && i%b==0){
//                lcm=i;
//                break;
//            }
//        }
//        System.out.println("LCM: "+lcm);

        // by Euclidean algorithm, optimized, LCM=a*b/hcf
        // find hcf

    }
}