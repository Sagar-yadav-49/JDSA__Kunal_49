package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term for Fibonacci: ");
        int n=sc.nextInt();
        int firstNum=0;
        int secondNum=1;
        for (int i = 0; i < n; i++) {
            System.out.println(firstNum);
            int nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }

    }
}