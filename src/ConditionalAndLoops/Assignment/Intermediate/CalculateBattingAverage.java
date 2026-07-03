package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total runs of player: ");
        int total_runs= sc.nextInt();
        System.out.print("Enter no. of times player got out: ");
        int times_out = sc.nextInt();
        double average=0;
        if(times_out ==0){
            System.out.println("Batting average is undefined(never out)");
            return;
        } else{
            average = (double) total_runs / times_out;
        }
        System.out.println("Batting average is: "+average);
    }
}