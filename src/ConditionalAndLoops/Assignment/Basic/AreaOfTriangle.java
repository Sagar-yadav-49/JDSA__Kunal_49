package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height of triangle: ");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double area=(b*h)/2;
        System.out.println("Area of triangle: "+area);
    }
}