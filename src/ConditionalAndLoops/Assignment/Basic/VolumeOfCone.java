package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height: ");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double vol=(Math.PI*(r*r)*h)/3;
        System.out.println(vol);
    }
}