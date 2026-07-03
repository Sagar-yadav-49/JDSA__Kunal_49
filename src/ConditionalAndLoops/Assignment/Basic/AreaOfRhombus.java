package ConditionalAndLoops.Assignment.Basic;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lengths of 2 diagonals: ");
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        System.out.println((d1*d2)/2);

    }
}