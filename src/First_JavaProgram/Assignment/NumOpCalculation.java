package First_JavaProgram.Assignment;
// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class NumOpCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter any operator (+,-,*,/): ");
        String s=sc.next();
        if(s.equals("+")){
            System.out.println(a+b);
        } else if (s.equals("-")) {
            System.out.println(a-b);
        } else if (s.equals("*")) {
            System.out.println(a*b);
        } else {
            System.out.println(a/b);
        }
    }
}
