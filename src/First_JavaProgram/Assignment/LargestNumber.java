package First_JavaProgram.Assignment;
// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println("Greater: "+a);
        } else{
            System.out.println("Greater: "+b);
        }

    }
}