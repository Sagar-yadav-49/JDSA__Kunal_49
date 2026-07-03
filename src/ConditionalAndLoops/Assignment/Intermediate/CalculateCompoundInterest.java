package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;
// assume, if interest is compounded once a year
public class CalculateCompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate=sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time=sc.nextDouble();
        // with use of Math.pow() method
//        double amount= principal *Math.pow((1+(rate/100)),time);
//        double CI=amount-principal;
//        System.out.println("Final Amount is: "+amount);
//        System.out.println("Compound interest is: "+CI);

        // without Math.pow() method
//        double amount=principal;
//        for (int i = 0; i < time; i++) {
//            amount=amount+(amount*(rate)/100);
//        }
//        double CI=amount-principal;
//        System.out.println(CI);
    }
}