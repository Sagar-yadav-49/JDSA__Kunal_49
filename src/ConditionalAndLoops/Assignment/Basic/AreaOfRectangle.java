package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of Rectangle: ");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        float area=l*b;
        System.out.println(area);
    }
}