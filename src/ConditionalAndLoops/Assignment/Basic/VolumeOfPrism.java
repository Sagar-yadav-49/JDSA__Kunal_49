package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height: ");
        int base=sc.nextInt();
        int height=sc.nextInt();
        int volume=base*height;
        System.out.println(volume);

    }
}