package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height of parallelogram: ");
        float b=sc.nextFloat();
        float h=sc.nextFloat();
        float area=b*h;
        System.out.println("Area of parallelogram: "+area);
    }
}