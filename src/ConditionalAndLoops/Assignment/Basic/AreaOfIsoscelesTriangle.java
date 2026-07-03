package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. if you know base and height :-
            // area=(b*h)/2
        // 2. if you know the side lengths(but not the height)
            // area=root(4*a*a-b*b)b/4
        System.out.println("Enter side length and base: ");
        double a=sc.nextFloat();
        double b=sc.nextFloat();
        double area=Math.sqrt((4*a*a)-(b*b))*b/4;
        System.out.println(area);
    }
}