package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int numSub= sc.nextInt();
        System.out.println("Enter marks of each subject: ");
        float sum=0;
        for (int i = 0; i < numSub; i++) {
            float marks=sc.nextFloat();
            sum+=marks;
        }
        float average=sum/numSub;
        System.out.println("Average Marks: "+average);
    }
}