package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}