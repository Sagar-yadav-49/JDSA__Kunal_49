package First_JavaProgram.Assignment;
// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which you want series: ");
        int n=sc.nextInt();
        int firstNum=0;
        int secondNum=1;
        int nextNum=0;
        for(int i=1;i<=n;i++){
            System.out.print(firstNum);
            if(i<n){
                System.out.print(",");
            }
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }

    }
}