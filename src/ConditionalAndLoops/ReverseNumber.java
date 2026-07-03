package ConditionalAndLoops;

import java.util.Scanner;

// Q. print the reverse of a given number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // it's basically for printing
//        while(n>0){
//            System.out.print(n%10);
//            n=n/10;
//        }

        // but what if we need to print reverse after the loop, should be store into some variable
        int result=0;
        while(n>0){
            int r=n%10;
            result=result*10+r;
            n/=10;
        }
        System.out.println(result);
    }
}