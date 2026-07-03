package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double units=sc.nextDouble();
        double bill =1;
        if(units>=0 && units<=100){
            bill =5.50*units;
        } else if (units>100 && units<=150) {
            bill =6.0*units;
        } else if (units>150 && units<=300) {
            bill =6.0*units;
        } else{
            bill =7.0*units;
        }
        System.out.println(bill);
    }
}