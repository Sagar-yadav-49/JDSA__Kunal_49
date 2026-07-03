package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of subjects: ");
        int numSub =sc.nextInt();
        int sum=0;
        System.out.println("Enter Grades for each subject: ");
        for (int i = 0; i < numSub; i++) {
            int grade=sc.nextInt();
            sum+=grade;
        }
        double cgpa=(double)sum/ numSub;
        System.out.println(cgpa);
    }
}