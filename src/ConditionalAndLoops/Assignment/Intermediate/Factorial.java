package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of which you want to get factorial: ");
        int num=sc.nextInt();
        int fact=1;
        if(num ==0 || num==1){
            fact=1;
        }
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
}