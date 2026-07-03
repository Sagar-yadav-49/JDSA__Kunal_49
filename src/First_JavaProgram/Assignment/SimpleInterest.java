package First_JavaProgram.Assignment;
// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        int p=sc.nextInt();
        System.out.print("Enter time in years: ");
        float t=sc.nextFloat();
        System.out.print("Enter rate: ");
        float r=sc.nextFloat();

        double SI=(p*r*t)/100;
        System.out.println("Simple Interest is: "+SI);
    }
}