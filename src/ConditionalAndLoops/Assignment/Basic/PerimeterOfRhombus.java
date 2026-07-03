package ConditionalAndLoops.Assignment.Basic;
import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter diagonals: ");
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        double perm=2*Math.sqrt((d1*d1)+(d2*d2));
        System.out.println(perm);
    }
}