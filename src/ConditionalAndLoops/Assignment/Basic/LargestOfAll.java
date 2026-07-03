package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;
// 25. Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestOfAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            largest=Integer.max(largest,n);
        }
        System.out.println(largest);
    }
}