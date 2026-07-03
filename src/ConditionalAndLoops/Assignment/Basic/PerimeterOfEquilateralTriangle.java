package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side: ");
        int a=sc.nextInt();
        int perimeter=3*a;
        System.out.println(perimeter);
    }
}