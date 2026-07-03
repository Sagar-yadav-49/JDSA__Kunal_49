package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total sales amount: ");
        int totalSales=sc.nextInt();
        int baseSalary=10000;
        double commissionRate=0;
        double totalEarning=0;
        if(totalSales<=10000){
            System.out.println("No Commission is given !!");
        } else if (totalSales>10000 && totalSales<=100000) {
            commissionRate=0.05;
        } else {
            commissionRate=0.10;
        }
        double commissionAmount=totalSales*commissionRate;
        System.out.println("Commission amount to the respective commission rate is: "+commissionAmount);
        totalEarning=baseSalary+(totalSales*commissionRate);
        System.out.println("Total Earning of Employee is: "+totalEarning);
    }
}