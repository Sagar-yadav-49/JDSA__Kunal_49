package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side and base: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(2*(a+b));
    }
}