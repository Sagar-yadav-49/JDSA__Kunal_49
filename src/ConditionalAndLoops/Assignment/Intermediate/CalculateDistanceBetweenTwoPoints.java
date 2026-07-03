package ConditionalAndLoops.Assignment.Intermediate;
// Calculate Distance Between Two Points for a 2D plane \(d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}\)
import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Coordinates of 1st point(x1 , y1): ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.print("Enter Coordinates of 2nd point(x2 , y2): ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Distance between two points is: "+distance);
    }
}