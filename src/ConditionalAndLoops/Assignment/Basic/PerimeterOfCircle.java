package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=sc.nextFloat();
        double perimeter=2*Math.PI*r;
        System.out.println(perimeter);
    }
}