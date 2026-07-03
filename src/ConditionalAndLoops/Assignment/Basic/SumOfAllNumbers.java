package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

// 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            int n=sc.nextInt();
             sum+=n;
            if(n==0){
                System.out.println(sum);
                break;
            }

        }
    }
}