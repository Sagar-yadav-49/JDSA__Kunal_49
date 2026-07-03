package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side: ");
        double a=sc.nextFloat();
        double area=(a*a)*(Math.sqrt(3)/4);
        System.out.println(area);
    }
}