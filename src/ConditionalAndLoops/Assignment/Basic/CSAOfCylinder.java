package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class CSAOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height: ");
        float r=sc.nextFloat();
        float h=sc.nextFloat();
        System.out.println(2*Math.PI*r*h);
    }
}