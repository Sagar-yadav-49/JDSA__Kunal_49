package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers: ");
        int numLength=sc.nextInt();
        int sum=0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i < numLength; i++) {
            int num=sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum of given N numbers is: "+sum);
    }
}