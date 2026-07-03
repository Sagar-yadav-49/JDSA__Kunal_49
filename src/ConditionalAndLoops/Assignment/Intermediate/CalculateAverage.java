package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many number you gonna enter: ");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            sum+=num;
        }
        double average=sum/n;
        System.out.println(average);

    }
}