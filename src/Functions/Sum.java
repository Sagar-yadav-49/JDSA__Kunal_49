package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    // Method for sum of two numbers
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1=sc.nextInt();
        System.out.print("Enter num2: ");
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("Sum is: "+sum);
    }
}