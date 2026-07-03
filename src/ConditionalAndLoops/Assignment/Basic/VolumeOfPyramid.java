package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base length, base width and Pyramid height: ");
        float bl=sc.nextFloat();
        float bw=sc.nextFloat();
        float h=sc.nextFloat();
        float vol=(bl*bw*h)/3;
        System.out.println(vol);
    }
}